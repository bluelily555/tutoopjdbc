package codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        long multiple = sc.nextInt();
        long plus = sc.nextInt();
        int stopNumber = sc.nextInt();


        for (int i = 1; i < stopNumber; i++) {
            number = number * multiple + plus;

        }

        System.out.println(number);
    }
}
