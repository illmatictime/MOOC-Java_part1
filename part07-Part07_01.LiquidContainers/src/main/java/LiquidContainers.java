
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container0 = 0;
        int container1 = 0;

        while (true) {
            System.out.println(">");
            System.out.println("First: " + container0 + "/100");
            System.out.println("Second: " + container1 + "/100");
            
            String input = scan.nextLine();
            

            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equals("add") && amount>0){
                container0 += amount;
                if(container0 > 100){
                    container0 = 100;
                }
            }else if(command.equals("move") && amount>0){
                if(container0>=amount){
                    container1 += amount;
                    container0 -= amount;
                }else if(amount>container0){
                    container1 += container0;
                    container0 = 0;    
                }
                if(container1 >= 100){
                    container1 = 100;
                }

            }else if(command.equals("remove") && amount>0){
                container1 -= amount;
                if(container1 < 0){
                    container1 = 0;
                }
            
            }
        }
    }

}
