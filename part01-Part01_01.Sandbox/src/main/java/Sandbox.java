import java.util.Scanner;
 
public class Sandbox {
 
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");
        
        matti.setHeight(180);
        matti.setWeight(86);
        
        juhana.setHeight(175);
        juhana.setWeight(74);
        
        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());

        /*int i = 0;
        while (i < 30) {
        pekka.growOlder();
        i = i + 1;
        }
        
        antti.growOlder();*/

        /*System.out.println("");

        if (antti.isOfLegalAge()) {
        System.out.println(antti.getName() + " is of legal age");
        } else {
        System.out.println(antti.getName() + " is underage");
        }

        if (pekka.isOfLegalAge()) {
        System.out.println(pekka.getName() + " is of legal age");
        } else {
        System.out.println(pekka.getName() + " is underage ");
        }
    
        System.out.println(antti); // same as System.out.println(antti.toString());
        System.out.println(pekka); // same as System.out.println(pekka.toString());
        */
    }
}