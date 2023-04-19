package project2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*
            Create a program that uses an array to store a list of temperatures for a week,
            and then uses a loop to find the highest and lowest temperature for the week.
         */

        int[] temperatures = {62, 61, 67, 80, 79, 65, 57};

        int highestTemperature = Integer.MIN_VALUE;
        int lowestTemperature = Integer.MAX_VALUE;


        for (int i = 0; i < temperatures.length; i++) {

            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
            }
            if (temperatures[i] < lowestTemperature) {
                lowestTemperature = temperatures[i];
            }
        }

        System.out.println("Highest temperature for the week: " + highestTemperature);
        System.out.println("Lowest temperature for the week: " + lowestTemperature);

    }

}
