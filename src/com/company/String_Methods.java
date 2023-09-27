package com.company;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Abdullah";
        System.out.println("My name is " + name);
        System.out.println("The length of my name is" + name.length());
        System.out.println("The lowercase of my name is " + name.toLowerCase());
        System.out.println("The uppercase of my name is " + name.toUpperCase());

        String about = "     My age is 20       ";
        System.out.println(about);
        System.out.println("Now this line is being trim by removing all extra spaces \n" + about.trim());

        System.out.println("Remove First letter of my name " + name.substring(1));
        System.out.println("Remove First letter and Last letter of my name " + name.substring(1,7));
        System.out.println("Replace the l with o " + name.replace('l','o'));
        System.out.println("Change my abd with xyz " + name.replace("Abd", "xyz"));
        System.out.println("Does Name starts with mnl? " + name.startsWith("mnl"));
        System.out.println("Does Name ends with ullah?  " + name.endsWith("ullah"));
        System.out.println("What is the character at 1? " + name.charAt(0));
        System.out.println("What is the index of character 'b' in name? " + name.indexOf("b"));
        System.out.println("Is the 'llah' at the index 4 if yes return 4? "+ name.indexOf("llah",4));
        System.out.println("Is the string having name in it Abdullah? " + name.equals("abdullah"));
        System.out.println("Don't do case sensitive thing, Is the string having name in it Abdullah? " + name.equalsIgnoreCase("abdUllah"));
        System.out.println("David Leinweber Said: \t\n \"Give someone a program; you frustrate them for a day; teach them how to program, and you frustrate them for a lifetime\" ");
    }
}
