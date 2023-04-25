package codeup;

import java.util.Scanner;

public class Codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long octal = sc.nextLong();
        long decimal = 0;
        int i = 1;

        while(octal > 0){
            decimal = decimal + (octal % 10 * i);
            octal /= 10;

            i *= 8;
        }

        System.out.println(decimal);
    }
}
