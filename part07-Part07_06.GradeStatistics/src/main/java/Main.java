
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into
        // multiple classes.
        System.out.println("Enter point totals, -1 stops: ");
        int count = 0;
        int average = 0;
        int total = 0;
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                break;
            }

            if (points >= 0 && points <= 100) {
                total += points;
                count++;
                average = total / count;
            }
        }

        System.out.println("Point average (all): " + 1.0 * average);
    }
}
