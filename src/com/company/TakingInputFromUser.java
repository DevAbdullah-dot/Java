package com.company;
import java.util.Scanner; //importing scanner for input from user

public class TakingInputFromUser {
    public static void main(String[] args) {
        System.out.println("Input Numbers: ");

        /*
        Scanner at start is a class that is declaring a variable sc in which new is being used to
         create a object Scanner which is a constructor. Whereas, system.in is used for input in java
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int a = sc.nextInt(); //an would get a value from user that would be an integer
        System.out.println("Enter num2: ");
        int b = sc.nextInt(); //b would get a value from user that would be an integer
        int sum = a + b;
        System.out.println("The sum of two numbers is: " + sum);

        // Another case but for multiplication of two decimal by using float

        System.out.println("Enter num3: ");
        float num3 = sc.nextFloat(); //nothing different from  previous example just using float
        System.out.println("Enter num4: ");
        float num4 = sc.nextFloat();
        float multiplication = num3 * num4;
        System.out.println("Result of Multiplication  is: " + multiplication);

        // Check if the number you input is int type or not

        System.out.println("Check if the number you input is int type or not");
        boolean num5 = sc.hasNextInt(); //hasNext is used to check
        System.out.println("Result would be true or false");
        System.out.println(num5);

        // Next for a string

        System.out.println("Enter a line: ");
        String num6 = sc.nextLine();
        System.out.println(num6);
    }
}
