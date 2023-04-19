package project2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        // Write a java program to check whether a given number is prime or not?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime number or not :  ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is non-prime number");
        }
    }

       static boolean isPrime(int num){
     if (num<=1){
        return false;
        } for(int i=2; i<=num/2; i++) {
    if((num%1)==0)
        return false;
        } return true;
        }
        }





