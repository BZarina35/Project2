package project2;

public class Task10 {

    public static void main(String[] args) {

        // Write a program to print out duplicate elements from an Array of Strings?

        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 4, 7, 3};
        System.out.println("Duplicate elements in given");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (j != i)) {

                    System.out.print(arr[j] + " ");

                }

            }
        }
    }
}
