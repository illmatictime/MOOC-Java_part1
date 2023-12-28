import java.util.ArrayList;

public class Recipes {
    
    private ArrayList<String> recipes;

    public Recipes(ArrayList<String> recipe){
        this.recipes = new ArrayList<>();
    }

    public void addList(ArrayList<String> recipe){
        this.add(recipe);
    }

}
