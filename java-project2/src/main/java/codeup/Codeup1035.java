package codeup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int hexadecimal = Integer.parseInt(input, 16);

        System.out.printf("%o", hexadecimal);

        sc.close();
    }
}
