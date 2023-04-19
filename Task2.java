package project2;

public class Task2 {

    public static void main(String[] args) {

        /*
         Create an array of integer values. After the array is created,
         calculate the sum of all stored elements in that array
         */

        int[] carsSold = {12, 15, 25, 33, 45};
        int sum = 0;
        for (int i = 0; i < carsSold.length; i++) {
            sum = sum + carsSold[i];

        }
        System.out.println(sum);
    }
}
