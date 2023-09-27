package com.company;
import java.util.Scanner;
public class Practice_Set2 {
    public static void main(String[] args) {
        String a = "    How is the Day Going    ";
        System.out.println("Uppercase\n" + a.toUpperCase());
        System.out.println("Removing Spaces\n" + a.trim());
        String b = "Java";
        System.out.format("letter = \"Dear, %s Thanks A lot.\"",b);
        System.out.println("\n" + a.hashCode());
    }
}
