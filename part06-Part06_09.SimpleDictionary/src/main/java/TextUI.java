/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jlanderos
 */
import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start(){

        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("end")){
                System.out.println("Bye Bye");
                break;
            }else if(command.equals("search")){
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                System.out.println("word to be translated: " + search);
                if(this.simpleDictionary.translate(search) == null){
                    System.out.println("Word " + search + " was not found");
                    continue;
                }
                System.out.println("Translation: " + this.simpleDictionary.translate(search));
                continue;
            }else if(command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);
                continue;
            }else{
                System.out.println("Unknown command");
                continue;
            }
        }
    }
}
