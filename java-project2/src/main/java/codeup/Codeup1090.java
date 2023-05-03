package codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        long stepNumber = sc.nextInt();
        long idxNumber = sc.nextInt();

        long idx = 1;
        while(idx < idxNumber){
            number *= stepNumber;
            idx++;
        }

        System.out.println(number);
    }
}