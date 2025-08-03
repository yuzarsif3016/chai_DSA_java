import java.util.ArrayList;
import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 1, 2 };
        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers); // only works for arrays of primitives

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // converting array to ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
            numberList.add(number);
        }

        //sort ArrayList
        numberList.sort(null); // null uses natural ordering

    }
}
