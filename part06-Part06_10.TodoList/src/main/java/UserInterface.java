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

public class UserInterface {
    private TodoList anotherList;
    private Scanner anotherScanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.anotherList = list;
        this.anotherScanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = anotherScanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            commandProcessor(command); 
        }
    }
    
    public void commandProcessor(String command){
        if(command.equals("add")){
            addTask();
        }else if(command.equals("list")){
            printTasks();
        }else if(command.equals("remove")){
            removeTask();
        }else{
            System.out.println("Unknown command");
        }
    }
    
    
    public void addTask(){
        System.out.print("To add: ");
        String task = this.anotherScanner.nextLine();
        this.anotherList.add(task);          
    } 
    
    public void printTasks(){
        this.anotherList.print();
    }
    
    public void removeTask(){
        System.out.print("Which one is removed? ");
        int num = Integer.valueOf(this.anotherScanner.nextLine());
        this.anotherList.remove(num);
    }
}
