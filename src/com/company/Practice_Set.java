package com.company;
import java.util.Scanner;
public class Practice_Set {
    public static void main(String[] args) {

    // Question: float a = 7/4 * 9/2

        float a;
        /*This process is casting like assigning an int to be a char ----- int --> char*/
        a = 7/4.0f * 9/2.0f; // in this case we need to make the integer divide by float to get an accurate answer
        System.out.println(a);

    //encrypt your grade by adding an 8 to it then decrypt it

        char grade = 'C';
        grade = (char) (grade + 8); // the char + int is int so that's why we added (char
        System.out.println("Encrypted Garde is " + grade);

        grade = (char) (grade - 8); // the char - int is int so that's why we added (char)
        System.out.println("Decrypted Grade is "+ grade);

    // check whether the number you have is greater than the user entered number or not

        double number = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double entered = sc.nextInt();

        if (entered>number){
            System.out.println("The number you entered is greater than original number");
        }else if(entered == number){
            System.out.println("The number you entered is equal to the original number");
        }else{
            System.out.println("The number you entered is not greater than original number");
        }
        System.out.println("Original number is " + number);

    // let us solve third equation of motion.

        float v;
            System.out.println("Enter value of v");
        v = sc.nextFloat();
        v = v*v;
        float u;
            System.out.println("Enter value of u");
        u = sc.nextFloat();
        u= u*u;
        float a1;
            System.out.println("Enter value of a");
        a1 = sc.nextFloat();
        float s;
            System.out.println("Enter value of s");
        s = sc.nextFloat();
        float as = 2 * a1 * s;

        float result = (v - u) / as;
            System.out.println("The Result is: " + result);

        // find value of a from a = 7*49/7 + 35/7

        int x = 7;
        int a2 = (x * 49) / x + 35 / x;
        System.out.println("The Result of expression is " + a2);
    }
}
