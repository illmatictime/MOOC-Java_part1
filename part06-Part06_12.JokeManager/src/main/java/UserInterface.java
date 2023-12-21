
import java.util.Scanner;
import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoda
 */
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = new JokeManager();
        this.scanner = new Scanner(System.in);
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            
            if (command.equals("X")){
                break;
            }
            
            if(command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                jokes.addJoke(joke); 
            }else if (command.equals("2")) {
                jokes.drawJoke();
            }else if(command.equals("3")){
                jokes.printJokes();
            } 
            
        }
    }
}
