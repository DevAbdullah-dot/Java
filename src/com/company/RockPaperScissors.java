package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String validCharacters = "PRS"; // String letters allowed
        Random random = new Random(); //instance of random
        int randomIndex = random.nextInt(validCharacters.length()); // gets random index
        char randomChar = validCharacters.charAt(randomIndex); // gets random character by using index

        System.out.println("Your Choice");
        String choice = sc.nextLine().toUpperCase();
        System.out.println("Computer Input: " + randomChar);

        if (choice.length() == 1 && validCharacters.contains(choice)) {
            if (choice.charAt(0) == randomChar) {
                System.out.println("It's a tie!");
            } else if (
                    (choice.charAt(0) == 'P' && randomChar == 'R') ||
                            (choice.charAt(0) == 'R' && randomChar == 'S') ||
                            (choice.charAt(0) == 'S' && randomChar == 'P')
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        } else {
            System.out.println("Invalid choice. Please choose P, R, or S.");
        }

        sc.close();
    }
}
