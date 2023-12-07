
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        
        System.out.println("");
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        for(String index:username){
            if(index.equals(user)){
                for(String index1:password){
                    if(index1.equals(pass)){
                        System.out.println("You have successfully logged in!");
                        return;
                    }
                }
            }
        }

        System.out.println("Incorrect username or password!");
    }
}
