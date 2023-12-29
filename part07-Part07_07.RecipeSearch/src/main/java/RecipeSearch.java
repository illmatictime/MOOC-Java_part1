
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            recipesUserInterface ui = new recipesUserInterface();

            System.out.print("Name of the file: ");
            String fileName = scanner.nextLine();
            
            ui.start(fileName);
        }

       // Recipes ingredients = new Recipes();
        
    }

}

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     Grades grades = new Grades();

    //     UserInteface ui = new UserInteface(grades, scanner);

    //     ui.start();

    // }