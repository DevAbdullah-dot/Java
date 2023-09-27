package com.company;
import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marksObtained = 0;
        int totalMarks = 100;

        for(int i=1; i<=5; i++){
            System.out.println("Enter marks of subject " + i + ":" );
            int result = input.nextInt();

            if(result<0 || result>20){
                System.out.println("Invalid Input");
                System.exit(0); //stop execution on wrong input
            }else{
                marksObtained+=result;
            }
        }
        System.out.println("Total Marks Obtained are: " + marksObtained + " Out of" + totalMarks);
        int percentage = (marksObtained*100)/100;
        System.out.println("Percentage of Exams: " + percentage + "%");
    }
}
