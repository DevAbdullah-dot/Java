package com.company;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String name = new String("Abdullah"); // Way to make a string
        System.out.println("My Name is " + name);
        String quoteOfDay = "Quote of the Day";
        System.out.println(quoteOfDay); // second way to make a string
        String quote ="When you think of Quitting, Remember Why did you Started.";
        System.out.println(quote);

        System.out.print("Value of Power: "); // same line output cause it's print()
        System.out.println("It's not Over until I Win!");

        int a = 10;
        float b = 20.0f;
        String line = "Hello,";
        char c = 'F';
/*
        In this case we are using printf (or format) that is used to helps simplify the task of printing formatted output to the console
        also we have used multiple things like,
        %d ---> int
        %f ---> float
        %s ---> strings
        %c ---> char
*/
        System.out.printf("The value of a is %d and the value of b is %f and the line states as %s " +
                "meanwhile the character has the value %c",a,b,line,c);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a line");
        String hello = sc.nextLine();
        System.out.println("The line you typed is: " + hello);

    //formatting with decimal points
        // %5.2f means 5 spaces and give output to two decimal points and f is for floats

        float line1 = 8.989f;
        System.out.printf("The line would have a gap of 5 and decimal would be up to 2 decimal points %5.2f",line1);
    }
}
