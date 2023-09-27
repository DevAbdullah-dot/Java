package com.company;
import java.util.Scanner;
public class Practice_Set3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Each Subject");
        int marks = 0;
        System.out.println("Marks for Subject " + 1);
        int marks1 = sc.nextInt();
        System.out.println("Marks for Subject " + 2);
        int marks2 = sc.nextInt();
        System.out.println("Marks for Subject " + 3);
        int marks3 = sc.nextInt();
        System.out.println(marks);
        int totalMarks = marks1 + marks2 + marks3;
        if (totalMarks>300){
            System.out.println("Re-Enter");
        }else{
            System.out.println("\n");
        }
        float percentage = (float) (totalMarks * 100) / 300;
        if (percentage>33){
            System.out.println("Your Percentage is " + percentage + "%");
            System.out.println("You Passed");
        }else{
            System.out.println("Put a Sock in it!");
        }
    }
}
