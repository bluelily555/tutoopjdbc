package codeup;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char c = 'a';
        do{
            System.out.printf("%c ", c++);
        } while (c <= str.charAt(0));
    }
}
