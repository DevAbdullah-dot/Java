package com.company;
import java.util.Scanner;
public class intOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        boolean integer = sc.hasNextInt();
        if (integer == true){
            System.out.println("It is an integer");
        }else{
            System.out.println("Not an Integer");
        }
    }
}
