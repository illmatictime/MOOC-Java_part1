
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 1;
        if(input == 0){
            System.out.println("Factorial: 1");
        }else{
            for(int i = 1; i<=input; i++){
                sum = sum * i;
            }
            System.out.println("Factorial: " + sum);
        }  
    }
}
