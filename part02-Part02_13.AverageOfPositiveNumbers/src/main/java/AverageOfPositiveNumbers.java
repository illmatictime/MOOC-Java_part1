
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNumSum = 0;
        int positiveNumCounter = 0;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0){
                break;
            }
            
            if(input < 0){
                continue;
            }
            
            if(input>0){
                positiveNumSum = positiveNumSum + input;
                positiveNumCounter = positiveNumCounter + 1;
            }
        }
        double average = (1.0)*positiveNumSum / positiveNumCounter;
        if(positiveNumCounter <= 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(average);
        }
        
    }
}
