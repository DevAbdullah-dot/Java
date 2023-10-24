package com.company;

/*
Strings in java are immutable means can't be changed

Strings are stored in stack and in heap
e.g
String Str = "h";
In stack str is stored. In heap, h is stored.
*/
public class String_Builders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
        //add char at index 0
        sb.insert(0,'S');
        System.out.println(sb);
        //insert 'n' at index 3
        sb.insert(3,'n');
        System.out.println(sb);
        //delete at index 3
        sb.delete(3,4);
        System.out.println(sb);
    }
}
