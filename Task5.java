package project2;

public class Task5 {

    public static void main(String[] args) {

        // Write a program to swap 2 numbers without a temporary variable?

        int a = 25;
        int b = 35;

        a=a=b;
        b=a-b;
        a=a-b;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        System.out.println("After swapping: a = " + b + ", b = " + a);


    }
}
