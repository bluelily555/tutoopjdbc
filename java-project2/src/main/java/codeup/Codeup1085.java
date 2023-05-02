package codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();

        //저장공간 계산식 : h * b * c * s

        System.out.printf("%.1f MB", h * b * c * s / 8.0 / 1024 / 1024);

    }
}
