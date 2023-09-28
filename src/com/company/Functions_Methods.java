package com.company;
import java.util.Scanner;

//functions and methods both are block of code
//Only difference in both is that functions are called directly while methods are called through classes objects
public class Functions_Methods {

    //Sum 2 numbers using function

    public static int CalculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    //Multiply three numbers using function

    public static int multiplyNum(int x, int y, int z){
        int result = x * y * z;
        return result;
    }

    //subtract 1 numbers

    public static float subtractNum(int q , float w){
        float sub = w - q;
        return sub;
    }

    //factorial of a num

    public static void factorialNum(int n){
        //loop so that if entered 0 answer is 1
        //if statement for any negative number

        if(n<0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial*=i;
        }
        System.out.println("Your Answer is " + factorial);
    }

    public static void main(String[] args) {

        //for sum

        int a = 10;
        int b =20;
        int sum = CalculateSum(a,b);
        System.out.println("The sum of 10 and 20 is : " + sum);

        //for multiplication

        int result = multiplyNum(10, 10,10 );
        System.out.println("The answer of multiplication is: " + result);

        //for subtraction

        float sub = subtractNum(10,20.5f);
        System.out.println("The subtraction result is: " + sub);


        //for factorial

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for which you want to take factorial of: ");
        int n = sc.nextInt();
        factorialNum(n);
    }
}
