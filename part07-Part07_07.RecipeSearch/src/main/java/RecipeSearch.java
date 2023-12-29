
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            recipesUserInterface ui = new recipesUserInterface();

            System.out.print("File to read: ");
            String fileName = scanner.nextLine();

            ui.startAndCommands(fileName);
            ui.printCommands();

            while (true) {
                System.out.print("\nEnter command: ");
                String userCommand = scanner.nextLine();
                boolean isContinue = ui.userCommand(userCommand, scanner);
                if (!isContinue) {
                    break;
                }
            }
        }

        // Recipes ingredients = new Recipes();

    }

}
