import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class recipesUserInterface {
    
    //private ArrayList<String> ingredients;
    private ArrayList<Recipes> recipes;

    public recipesUserInterface(){
        //this.ingredients = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    public void startAndCommands(String fileName){
        readRecipes(fileName);
        //System.out.println(recipes);
    }

    public void readRecipes(String fileName){
        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()){
                String recipeName = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                Recipes recipe = new Recipes(recipeName, cookingTime);
                
                this.recipes.add(recipe);

                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    
                    if(ingredient.isEmpty()){
                        //System.out.println("There is an empty line!");
                        break;
                    }

                    recipe.addIngredients(ingredient);
                }


            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean userCommand(String userCommand){
        if(userCommand.equals("stop")){
            return false;
        }else if(userCommand.equals("list")){
            printRecipes();
            return true;
        }
        return true;
    }

    public void printRecipes(){
        System.out.println("");
        System.out.println("Recipes:");
        for(Recipes recipe: recipes){
            System.out.println(recipe);
        }
    }

    public void printCommands(){
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.print("\nEnter command: ");
    }
}
