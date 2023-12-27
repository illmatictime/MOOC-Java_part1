
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        String file = scanner.nextLine();
        

        Recipes ingredients = new Recipes();
        
        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                list.add(fileReader.nextLine());
                if(fileReader.hasNext("")){
                    ingredients.add
                }
            }
        } catch (Exception e) {
            System.out.println("File does not exist: " + e.getMessage());
        }

        System.out.println(list);
    }

}
