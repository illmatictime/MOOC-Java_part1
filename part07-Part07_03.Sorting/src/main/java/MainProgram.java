
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {6, 3, 0, -1, 4 };
        
        System.out.println(MainProgram.smallest(array));
    }

    
    public static int smallest(int[] array){
        int smallest = array[0];
        System.out.println(smallest);
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("for loop: " + array[i]);
            if(array[i] < smallest){
                smallest = array[i];
                System.out.println("smallest: " + smallest);
            }
        }
        
        System.out.println(smallest);
        return smallest;
    }

}
