
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        String longestName = "";
        int length = 0;
        int count = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            int birthYear = Integer.valueOf(parts[1]);
            
            if(parts[0].length()>length){
                length = parts[0].length();
                longestName = parts[0];
            }
            sum = sum + birthYear;
            count = count + 1;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum/count));
    }
}
