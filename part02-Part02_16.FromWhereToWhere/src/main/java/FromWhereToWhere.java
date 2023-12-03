
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?" );
        int endNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int startNum = Integer.valueOf(scanner.nextLine());
        
        if(startNum<=endNum){
            for(int i = startNum; i<=endNum; i++){
                System.out.println(i);
            }
        }
            

    }
}
