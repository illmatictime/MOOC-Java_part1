
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdsUI ui = new BirdsUI();

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.print("? ");
                String userCommand = scan.nextLine();
                boolean isContinue = ui.userCommand(userCommand, scan);
                if (!isContinue) {
                    break;
                }
            }

        }

    }

}
