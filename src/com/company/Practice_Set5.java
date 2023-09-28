package com.company;

public class Practice_Set5 {
    public static void main(String[] args) {

        //Advanced Patterns

        // Butterfly Pattern

        System.out.print("\n\nButterfly Pattern\n\n");

        int n = 4;

        //UPPER HALF

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //LOWER HALF

        for (int i=n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Solid Rhombus

        System.out.print("\n\nSolid Rhombus\n\n");

        int m = 5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Number Pyramid

        System.out.print("\n\nNumber Pyramid\n\n");

        int k = 5;

        for(int i=1; i<=k; i++){
            for(int j=1; j<=k-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Palindromic Pattern

        System.out.print("\n\nPalindromic Pattern\n\n");

        int l = 5;

        // first half with a loop in backwards direction

        for(int i=1; i<=l; i++){
            for(int j=1; j<=l-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // second half with a loop in forward direction

            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }

        // Diamond Pattern

        System.out.print("\n\nDiamond Pattern\n\n");

        int y=4;

        //Upper Half

        for(int i=1; i<=y ;i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half

        for(int i=y; i>=1 ;i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
