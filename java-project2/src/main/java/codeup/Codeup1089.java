package codeup;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int stepNumber = sc.nextInt();
        int idxNumber = sc.nextInt();

        int idx = 1;
        do{
            idx++;
            number += stepNumber;

        }while(idx < idxNumber);

        System.out.println(number);
    }
}
