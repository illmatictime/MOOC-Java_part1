
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        String file = scanner.nextLine();
        

       // Recipes ingredients = new Recipes();
        
        ArrayList<Recipes> list = new ArrayList<>();

        Recipes recipes = new Recipes();

        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                if(!(fileReader.hasNext())){
                    //list.add(fileReader.nextLine());
                    System.out.println("found the empty line");
                    break;
                }else{
                    list.add(fileReader.nextLine());
                }
                // list.add(fileReader.nextLine());
                recipes.add(list);
            }
        } catch (Exception e) {
            System.out.println("File does not exist: " + e.getMessage());
        }

        System.out.println(list);
    }

}
// if(fileReader.equals(null)){
//                     System.out.println("Nice try");
//                 }else{
//                     recipes.add(fileReader);
//                 }