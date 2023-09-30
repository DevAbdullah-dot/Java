package com.company;
import java.util.Scanner;
public class Arrays_2d {
    public static void main(String[] args) {

        // A 2X4 table through 2D Array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols]; // 2D Array

        //input
        //rows

        for(int i=0; i<rows; i++){
            //input
            //columns
            for(int j=0; j<cols; j++){
                System.out.println("Enter value");
               numbers[i][j] = sc.nextInt();
            }
        }

        //Output
        //rows

        for(int i=0; i<rows; i++){
            //Output
            //columns
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Search in 2D array
        System.out.println("Enter the value you want to find");
        int x = sc.nextInt();

        //search in rows

        for(int i=0; i<rows; i++){
            //search in columns
            for(int j=0; j<cols; j++){
                if (x == numbers[i][j]){
                    System.out.println();
                    System.out.println(x + " is found at index (" + i + "," + j + ")");
                }
            }
        }

    }
}
