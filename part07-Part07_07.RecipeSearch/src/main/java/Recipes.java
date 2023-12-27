import java.util.ArrayList;

public class Recipes {
    
    private ArrayList<String> recipes;

    public Recipes(ArrayList<String> recipe){
        this.recipes = recipe;
    }

    public void add(String recipe){
        this.recipes.add(recipe);
    }

}
