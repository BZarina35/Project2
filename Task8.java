package project2;

public class Task8 {

    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int[] arr = { 7, 2, 9, 15, 5, 12 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
    }

