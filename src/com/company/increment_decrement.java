package com.company;
import java.util.Scanner;

public class increment_decrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10;
        System.out.println(a++); // it would be incremented by making a = a+ 1;
        System.out.println(a); // answer be 11
        System.out.println(a--); // decrement would make it 10
        System.out.println(a);  // 10 would be displayed up here

        int b = 200;
        System.out.println(b+=100); // 300 as a answer
        System.out.println(b-=100); // 200 as a answer

        int c = 50;
        System.out.println("Enter a value: ");
        int d = sc.nextInt();
        System.out.println(d+=c);

        char letter = 'A';
        letter++; // char can also be increment
        System.out.println(letter); // result would be B 
    }
}
