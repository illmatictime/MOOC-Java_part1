
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] parts = input.split(" ");
            for(int i = 0; i < parts.length; i++){
                System.out.println(parts[i]);
            }
        }
        /*        String input = scanner.nextLine();
        if(input.equals("")){
        return;
        }
        
        String[] parts = input.split(" ");
        System.out.println("");
        for(int i = 0; i < parts.length; i++){
        System.out.println(parts[i]);
        }*/
    }
}
