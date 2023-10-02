package com.company;
import java.util.Scanner;

public class Practice_Set_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row number: ");
        int rows = sc.nextInt();
        System.out.println("Enter the column number: ");
        int cols = sc.nextInt();

        int numbers [][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter Values");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Values in Array are: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}

