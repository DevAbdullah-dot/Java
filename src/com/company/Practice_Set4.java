package com.company;

public class Practice_Set4 {
    public static void main(String[] args) {

        // solid rectangle

        System.out.println("\nA solid Rectangle \n\n");

        for (int i=1; i<=5; i++){
            for (int j=1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // hollow rectangle

        System.out.println("\n\nA Hollow Rectangle\n\n");

        int n=4;
        int m=6;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i == 1 || i == n ||  j == 1  || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Half Pyramid

        System.out.println("\n\nHalf Pyramid\n\n");

        int k=4;

        for (int i=1; i<=k; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nInverted Half Pyramid\n\n");

        int x= 4;
        for(int i=1; i<=x; i++){
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nInverted Half Pyramid 180 degree\n\n");

        int y=4;

        for(int i=1; i<=y; i++){
            //inner loop1 --> for spaces
            for(int j=1; j<=y-i; j++){
                System.out.print(" ");
            }
            //inner loop2 --> for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nHalf Pyramid with numbers\n\n");

        int o=5;

        for(int i=1; i<=o; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n\nInverted Half Pyramid with numbers\n\n");

        int q=5;

        for(int i=1; i<=q; i++){
            for(int j=1; j<=q-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
