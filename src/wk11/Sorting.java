package wk11;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 7, 10, 10, 4, -8, 10, 4};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        for (int splitIndex = 0; splitIndex < numbers.length; splitIndex++) {
            int smallest = numbers[splitIndex];
            int smallestIndex = splitIndex;
            for (int i = splitIndex + 1; i < numbers.length; i++) {
                if (smallest > numbers[i]) {
                    smallestIndex = i;
                    smallest = numbers[i];
                }
            }
            numbers[smallestIndex] = numbers[splitIndex];
            numbers[splitIndex] = smallest;
        }
    }
}
