
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = 0;
        int temp = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            value = Integer.valueOf(parts[1]);
            
            if(value > temp){
                temp = value;
            }            
        }
        System.out.println("Age of the oldest: " + temp);
    }
}
