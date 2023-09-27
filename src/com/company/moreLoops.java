package com.company;

public class moreLoops {
    public static void main(String[] args) {

        System.out.println("Print odd numbers using for loop");

        for(int i=1; i<12; i+=2) {
            System.out.println(i);
        }

        System.out.println("\nPrint odd numbers in reverse order");

        for (int j=12; j>0; j--){
            System.out.println(j);
        }

        //break in loop

        for (int l = 0; l<10; l++){
            System.out.println("Hello World");
            if (l==2){
                break;
            }
        }

        //continue in loop

        for (int k = 0; k<10; k++){
            System.out.println("Bye World");
            if (k==2){
                continue; //10 iteration would me made
            }
        }
        }
    }
