
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        try (Scanner scan = new Scanner(System.in)) {
            BirdsUI ui = new BirdsUI();
            System.out.print("?");
            // add command menu
            String command = scan.nextLine();

        }

    }

}
