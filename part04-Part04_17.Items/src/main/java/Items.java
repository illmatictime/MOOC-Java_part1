
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item
        
        //ArrayList<Item> 
        //variable list is an arraylist of type Item
        //<Item> refers to the class name
        //it is common (99.9%) to create a class file witha the same class name
        ArrayList<Item> list = new ArrayList<>(); //new object
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Name:");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            //items is object
            list.add(new Item(name));
        }
        
        System.out.println("");
        for(Item y : list){
            System.out.println(y);
        }   
    }
}
