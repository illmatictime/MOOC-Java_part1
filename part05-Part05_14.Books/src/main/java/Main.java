
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
//            System.out.println(books);
//            System.out.println(book);
            //books.add(book);
            if(!(books.contains(book))){
                books.add(book);
            }else{
                System.out.println("The book is already on the list. "
                        + "Let's not add the same book again.");;
            }
//        System.out.println("after all said and done" + "\n" + books);
//        System.out.println(book);

        }
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
