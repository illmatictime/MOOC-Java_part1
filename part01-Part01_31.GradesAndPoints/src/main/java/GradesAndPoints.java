
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int gradeInput = Integer.valueOf(scan.nextLine());
        
        if (gradeInput<0){
            System.out.println("Grade: impossible!");
        }else if(gradeInput<=49){
            System.out.println("Grade: failed");
        }else if(gradeInput<=59){
            System.out.println("Grade: 1");
        }else if(gradeInput<=69){
            System.out.println("Grade: 2");
        }else if(gradeInput<=79){
            System.out.println("Grade: 3");
        }else if(gradeInput<=89){
            System.out.println("Grade: 4");
        }else if(gradeInput<=100){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");       
        }
    }
}
