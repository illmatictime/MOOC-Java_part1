import java.util.ArrayList;
import java.util.Scanner;

public class BirdsUI {
    private ArrayList<Birds> birds; // data

    public BirdsUI() {
        this.birds = new ArrayList<>();
    }

    public void readBirds(String birds) {
        System.out.println("reading");
    }

    public boolean userCommand(String userCommand, Scanner scan) {
        if (userCommand.equals("Quit")) {
            System.out.println("Quitting");
            return false;
        } else if (userCommand.equals("Add")) {
            System.out.println("Adding:");
            addBird(scan);
        } else if (userCommand.equals("Observation")) {
            System.out.println("Observation:");
            addObservation(scan);
        } else if (userCommand.equals("All")) {
            System.out.println("Printing All");
            printAllBirds(scan);
        } else if (userCommand.equals("One")) {
            System.out.println("Printing one bird");
            printABird(scan);
        }
        return true;
    }

    private void addObservation(Scanner scan) {
        System.out.print("Bird? ");
        String observedBird = scan.nextLine();
        for (Birds abird : birds) {
            if (abird.getEnglishName().equals(observedBird)) {
                abird.addObservation();
            }
        }
    }

    private void printABird(Scanner scan) {
        System.out.print("Bird? ");
        String oneBird = scan.nextLine();
        System.out.println(oneBird);
        for (Birds abird : birds) {
            if (abird.getEnglishName().equals(oneBird)) {
                System.out.println(abird);
            }
        }
    }

    private void printAllBirds(Scanner scan) {
        for (Birds abird : birds) {
            System.out.println(abird);
        }
    }

    private void addBird(Scanner scan) {
        System.out.print("Name: ");
        String englishName = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        Birds bird = new Birds(englishName, latinName);
        this.birds.add(bird);
    }
}
