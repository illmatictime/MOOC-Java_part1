
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> jokes = new ArrayList<>();
        System.out.println("What a joke!");
        JokeManager jokeManager = new JokeManager();
        
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
                
            } else if (command.equals("2")) {
                    System.out.println("Drawing a joke.");
                    jokeManager.drawJoke();
                if (jokes.isEmpty()) {
                    System.out.println("Jokes are in short supply.");
                } else {
                    Random draw = new Random();
                    int index = draw.nextInt(jokes.size());
                    System.out.println(jokes.get(index));
                }
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }
    }
}
