import java.util.*;

// Reverse an Array
public class reverseArray {

    // Method to reverse the array
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            // Swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // Move the pointers
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers); // Reverse the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // Print the reversed array
        }
        System.out.println();
    }
}
