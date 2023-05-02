package codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long b = sc.nextInt();

        System.out.printf("%.2f MB", w * h * b / 8.0 /1024 / 1024);
    }
}
