package project2;

public class Task3 {

    public static void main(String[] args) {

        /*
        Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers = {{11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25}
        };

        for (int[] nums : numbers) {
            for (int num2 : nums) {
                if (num2 % 2 == 0) {
                    System.out.println(num2);


                }
            }
        }
    }
}