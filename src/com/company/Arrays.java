package com.company;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[3]; // 1 Way to write an array
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        String[] names = new String[3]; // 2nd Way to write an array
        names[0] = "Abdullah";
        names[1] = "Umar";
        names[2] = "Ali";

        for (int i = 0; i < 3; i++) {
            System.out.println("Name " + names[i]);
            System.out.println("Marks " + marks[i]);
        }

        int array[]= {1,2,3,4}; // 3rd Way to write an array
        for (int i=0; i<4; i++) {
            System.out.println("List of numbers within array are: " + array[i]);
        }

        System.out.print("Define the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Input a number: ");
            numbers[i] = + sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print("The array consist of followings: ");
            System.out.println(numbers[i]);
        }

        // Question: Take an array from the user. Search for the given number x in it and print the index. AKA linear search

        System.out.print("\nEnter the Size of array ");
        int arraySize = sc.nextInt();

        int numInArray[] = new int[arraySize];

        for(int i=1; i<arraySize; i++){
            System.out.print("\nEnter numbers in array ");
            numInArray[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to find the array ");
        int x = sc.nextInt();

        for(int i=1; i<numInArray.length; i++){
            if(numInArray[i] == x){
                System.out.print("\nx is found at index " + i);
            }
        }


    }
}
