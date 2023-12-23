
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 6, 9, 8, 12};
        
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
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

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int indexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("for loop: " + array[i]);
            if(array[i] < smallest){
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        System.out.println("smallest in 3: " + smallest);
        int indexOfSmallest = startIndex;
        System.out.println("smallest in 3: " + indexOfSmallest);

        for (int i = indexOfSmallest; i < table.length; i++) {
            System.out.println("for loop: " + table[i]);
            if(table[i] < smallest){
                smallest = table[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2){
        
    }

}
