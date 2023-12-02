
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nonZeroNum = 0;
        int nonZeroSum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input==0){
                break;
            }
            
            if(input != 0){
                nonZeroNum = nonZeroNum + 1;
                nonZeroSum = nonZeroSum + input;                
            }
        }
        System.out.println("Number of numbers: " + nonZeroNum);            
        System.out.println("Sum of the numbers: "+ nonZeroSum);
    }
}
