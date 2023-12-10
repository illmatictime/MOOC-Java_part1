import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, pages, publicationYear));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();
        
        for(int i = 0; i < books.size(); i++){
            //Book book = books.get(i);
            
            if(info.equals("everything")){
                System.out.println(books.get(i));
            }else if(info.equals("name")){
                System.out.println(books.get(i).getTitle());
            }
        }
            
        
        /*        if(info.equals("everything")){
        for(Book book:books){
        System.out.println(book);
        }
        }else if(info.equals("name")){
        for(Book book:books){
        System.out.println(book.getTitle());
        }
        }*/
    }
}
