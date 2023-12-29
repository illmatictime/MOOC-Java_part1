import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class recipesUserInterface {

    // private ArrayList<String> ingredients;
    private ArrayList<Recipes> recipes; // data

    public recipesUserInterface() {
        // this.ingredients = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    public void startAndCommands(String fileName) {
        readRecipes(fileName);
        // System.out.println(recipes);
    }

    public void readRecipes(String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String recipeName = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                Recipes individual = new Recipes(recipeName, cookingTime);

                this.recipes.add(individual); // this.recipes.add@[i]

                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();

                    if (ingredient.isEmpty()) {
                        // System.out.println("There is an empty line!");
                        break;
                    }

                    individual.addIngredients(ingredient);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean userCommand(String userCommand, Scanner scanner) {

        if (userCommand.equals("stop")) {
            return false;
        } else if (userCommand.equals("list")) {
            printRecipes();
        } else if (userCommand.equals("find name")) {
            System.out.print("Searched Word: ");
            findRecipeName(scanner);
        } else if (userCommand.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            maxCookingTime(scanner);
        } else if (userCommand.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            findRecipeByIngredient(scanner);
        }

        return true;
    }

    private void findRecipeByIngredient(Scanner scanner) {
        String ingredientName = scanner.nextLine();
        System.out.println("\nRecipes:");
        for (Recipes names : this.recipes) {
            if (names.getIngredients().contains(ingredientName)) {
                System.out.println(names);
            }
        }
    }

    private void maxCookingTime(Scanner scanner) {
        int time = Integer.valueOf(scanner.nextLine());
        System.out.println("\nRecipes:");
        for (Recipes names : this.recipes) {
            if (names.getCookingTime() <= time) {
                // System.out.println("found it");
                System.out.println(names);
            }
        }
    }

    public void findRecipeName(Scanner scanner) {
        // try (Scanner scanner = new Scanner(System.in)) {
        String name = scanner.nextLine();
        System.out.println("\nRecipes:");
        for (Recipes names : this.recipes) {
            if (names.getRecipeName().contains(name)) {
                // System.out.println("found it");
                System.out.println(names);
            }
        }
    }

    public void printRecipes() {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipes recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void printCommands() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("lists - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("Find ingredient - searches recipes by ingredient");
    }
}
