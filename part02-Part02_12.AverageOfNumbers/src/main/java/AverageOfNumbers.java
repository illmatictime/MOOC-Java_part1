
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0){
                break;
            }
            
            sum = sum + input;
            counter = counter + 1;
        }
        double average = ((1.0) * sum )/ counter;
        System.out.println("Average of the numbers: " + average);
    }
}
