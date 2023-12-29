
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
            
            ui.startAndCommands(fileName);
            
            ui.printCommands();
            String userCommand = scanner.nextLine();
            ui.userCommand(userCommand);
        }

       // Recipes ingredients = new Recipes();
        
    }

}
