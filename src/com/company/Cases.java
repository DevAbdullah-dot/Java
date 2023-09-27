package com.company;
import java.util.Scanner;
public class Cases {
    public static void main(String[] args) {

        System.out.println("Driving License Office");
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if (age > 17) {
            System.out.println("You're Eligible for a License");
        } else {
            System.out.println("Put a Sock in it!");
            System.exit(0);
        }
        int options = 0;
        System.out.println("Make a correct decision from following\n");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. HTV");
        System.out.println("Enter a correct number");
        options = sc.nextInt();
        switch (options) {
            case 1 -> System.out.println("Sedan fee is $100");
            case 2 -> System.out.println("SUV fee is $150");
            case 3 -> System.out.println("HTV fee is $400");
            default -> System.out.println("An Invalid Input");
        }
        System.out.println("Enter your Blood Group:");
        String group = sc.next();
        switch (group.toUpperCase()) {
            case "A":
            case "B":
            case "AB":
            case "O":
                System.out.println("Acknowledge");
                break;
            default:
                System.out.println("Unknown Blood Group");
                break;
        }
    }
}
