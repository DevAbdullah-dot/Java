package com.company;
import java.util.Scanner;
public class Practice_Set6 {

    //Enter 3 numbers from the user & make a function to print their average.

    public static int AverageOfNum(int a, int b, int c){
        int average = (a + b + c) / 3;
        System.out.println("The answer for average of these numbers is: " + average);
        return average;
    }

    //Write a function to print the sum of all odd numbers from 1 to n.

    public static int sumOfNum(int n){
        int total = 0;
        for(int i=0; i<=n; i++){
            if(i%2 != 0){
                total += i;
            }
        }
        return total;
    }

    //Write a function which takes in 2 numbers and returns the greater of those two.

    public static int GreaterOrLess(int x,int y){
        if (x ==y){
            System.out.println("Both are Equal");
            return x;
        }else{
            int greater = (x > y) ? x : y;
            return greater;
        }
    }

    // Write a function that takes in the radius as input and returns the circumference of a circle.

    public static double CircumOfCircle(double r){
        double circumferenceOfCircle = 2 * 3.14 * r;
        return circumferenceOfCircle;
    }

    // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

    public static String ageOfPerson(int age){
        String vote = (age >= 18 ) ? "Eligible to vote" : "Not Eligible to vote";
        return vote;
    }

    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

    public static int powerOfNum(int x1, int n1){
        double power = Math.pow(x1, n1); //for power
        return (int) power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for average

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("\nEnter value of b: ");
        int b = sc.nextInt();
        System.out.print("\nEnter value of c: ");
        int c = sc.nextInt();
        System.out.println();
        AverageOfNum(a,b,c);
        System.out.println();

        //for odd numbers

        System.out.print("Enter number for which you want sum of: ");
        int n = sc.nextInt();
        System.out.println("The sum is: " + sumOfNum(n));

        // for Greater or Less

        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter first number: ");
        int y = sc.nextInt();
        System.out.println("The one who is greater is: " + GreaterOrLess(x,y));

        // for Circumference of a circle

        System.out.print("\nEnter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("\nCircumference of Circle is: " + CircumOfCircle(r));

         // Person is eligible to vote or not

        System.out.print("\nEnter your Age: ");
        int age = sc.nextInt();
        System.out.println(ageOfPerson(age));

         //Write an infinite loop using do while condition.
/*
        int count = 0;

        do{
           System.out.println("Count: " + count);
           count++;
          }while(true);
*/

        // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

        int positive = 0;
        int negative = 0;
        int zero = 0;

        char choice;

        do{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            }else if(num<0){
                negative++;
            }else{
                zero++;
            }
            System.out.println("Do you want to enter another number? (y/n)?");
            choice = sc.next().charAt(0);
        } while (choice == 'y'  || choice == 'Y');

        System.out.println("Positive number count is: " + positive);
        System.out.println("Negative number count is: " + negative);
        System.out.println("Zero number count is: " + zero);

        // for x^n

        System.out.print("Enter value 1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter value 2: ");
        int n1 = sc.nextInt();
        System.out.print("Result: ");
        System.out.println(powerOfNum(x,n));

    }
}
