package project2;

public class Task9 {

    public static void main(String[] args) {

        // Write a java program to find the second largest number in the array?

        int[] arr = { 15, 11, 13, 10, 8, 9 };

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == max) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondMax);
        }
    }

}
