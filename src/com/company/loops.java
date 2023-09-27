package com.company;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 11;
        while (i > 10) {
            i -= 2;
        }
        System.out.println("11 - 2 is " + i);

        //print numbers from 100 to 200

        int num = 100;
        while(num<201){
            System.out.println(num);
            num++;
        }

        // print first 10 natural numbers using do-while loop

        int naturalNum = 1;
        do{
            System.out.println(naturalNum);
            naturalNum++;
        }while(naturalNum<11);
    }
}
