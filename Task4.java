package project2;

public class Task4 {

    public static void main(String[] args) {

        /*
        Create a 2D array of integers. Develop a program which will calculate the sum
        of even and odd numbers for that array
         */

        int [][] numbers = {
                {5,7,9,11,15,17},
                {13,24,16,18,20},
                {4,6,9,3,12}
        };
                int evenSum = 0;
                int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j] %2 ==0) {
                    evenSum += numbers[i][j];
                } else {
                    oddSum += numbers[i][j];

                }

            }

        }
        System.out.print(evenSum + " ");
        System.out.println();
        System.out.print(oddSum + " ");
                }
            }



