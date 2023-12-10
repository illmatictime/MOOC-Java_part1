
import com.sun.tools.javac.code.Attribute;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            //System.out.println("read\n" + fileReader + "\nend");
            while (fileReader.hasNextLine()){
                list.add(fileReader.nextLine());
            }
        } catch(Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
        
        
        
     
        /*        if(searchedFor.isEmpty()){
        break;
        }*/
        System.out.println(list);
        if(list.contains(searchedFor)){
            System.out.println("Found!");
        }else if(!list.contains(searchedFor)){
            System.out.println("Not found.");
        }
        

    }
}
