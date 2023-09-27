package com.company;

public class precedence_associativity {
    public static void main(String[] args) {
        /* In the following scenario the division (/) and the multiplication operator (*) has the same precedence
        so in the java what happens is that the associativity enters the room and starts it work from left to right
        */
        int f = 20/10 + 6*2;
        System.out.println("The answer is: " + f);

        // In some cases we have to use parentheses in order to avoid mistakes

        int a = 1;
        int b = 2;
        int c = 3;

        int k = b*b + (4*a*c)/(2*a);
        System.out.println("The answer is: " + k);
    }
}
