
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = "";
        String tempWord = "";
        int value = 0;
        int temp = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            word = parts[0];
            value = Integer.valueOf(parts[1]);
            /*      System.out.println(value+"/"+parts[1]);
            System.out.println("word " + parts[0] + " value " + parts[1]);
            System.out.println("outside if:");
            System.out.println("temp: " + temp+",value: "+value+", tempWord:"+tempWord+", word:"+word);
            System.out.println("            ==========        ");*/
            if(value > temp){
                temp = value;
                tempWord = word;
                /*                System.out.println("Name of the oldest: " + parts[0]);
                System.out.println("temp: " + temp+",value: "+value+", tempWord:"+tempWord+", word:"+word);*/
            }
            /*            System.out.println("            ==========        ");
            System.out.println("temp: " + temp+",value: "+value+", tempWord:"+tempWord+", word:"+word);
            System.out.println("            ==========        ");*/
        }
        System.out.println("Name of the oldest: " + tempWord);
    }
}
