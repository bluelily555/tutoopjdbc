package codeup;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.printf("%c", str.charAt(0)+1);
        sc.close();
    }
}
