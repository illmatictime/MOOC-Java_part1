import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        // int[] array = { 3, 1, 5, 99, 3, 12 };
        ArrayList<Integer> array = new ArrayList<>();
        array.add(8);
        array.add(3);
        array.add(7);
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
