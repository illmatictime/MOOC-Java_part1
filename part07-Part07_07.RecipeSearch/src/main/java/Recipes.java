import java.util.ArrayList;

public class Recipes {

    private ArrayList<String> ingredients;
    private String recipeName;
    private int cookingTime;

    public Recipes(String recipeName, int cookingTime) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
}
