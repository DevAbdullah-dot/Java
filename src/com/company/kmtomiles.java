package com.company;
import java.util.Scanner;
public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of kilometers(km): ");
        float km = sc.nextFloat();
        double multiplier = 0.621371;
        double result = (float) (km * multiplier);
        System.out.println("km to miles is: " + result);
    }
}
