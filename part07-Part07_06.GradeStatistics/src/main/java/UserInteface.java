import java.util.Scanner;

public class UserInteface {

    private Grades grade;
    private Scanner scanner;

    public UserInteface(Grades grades, Scanner scanner) {
        this.grade = grades;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        readPoints();
        printPointAndGrades();
    }

    public void readPoints() {
        while (true) {

            String input = scanner.nextLine();
            int points = Integer.valueOf(input);

            if (points == -1) {
                break;
            }

            if (points < 0 || points > 100) {
                continue;
            }

            this.grade.addPoints(points);

        }
    }

    public void printPointAndGrades() {
        System.out.println("Point average (all): " +
                1.0 * grade.averageOfPoints());
        if (grade.averagePointsOfPass() == -1) {
            System.out.println("Point average (passing): -");
        } else if (grade.averagePointsOfPass() > 0) {
            System.out.println("Point average (passing): " +
                    1.0 * grade.averagePointsOfPass());
        }

        System.out.println("Pass percentage: " + grade.passPercentage());
        
        System.out.println("Grade distribution:");
        int counter = 5;
        while (counter >= 0) {
            int star = grade.numberOfGrade(counter);
            System.out.print(counter + ": ");
            printStars(star);
            System.out.println("");
 
            counter = counter - 1;
        }
    }

    public static void printStars(int stars){
        while (stars > 0){
            System.out.print("*");
            stars--;
        }
    }
}
