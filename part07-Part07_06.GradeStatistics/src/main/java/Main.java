
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Grades> grades = new ArrayList<>();
        // Write your program here -- consider breaking the program into
        // multiple classes.
        System.out.println("Enter point totals, -1 stops: ");
        int count = 0;
        int average = 0;
        int total = 0;
        int passingGrade = 0;
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                break;
            }

            grades.add(points);
            // if (points >= 0 && points <= 100) {
            // total += points;
            // count++;
            // average = total / count;
            // }
            if (points >= 50) {
                passingGrade++;
            }
        }

        System.out.println("Point average (all): " + 1.0 * average);
        if (passingGrade >= 1) {
            System.out.println("point average (passing):" + passingGrade);
        }
        grades.toString();

    }
}
