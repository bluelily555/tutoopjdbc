package codeup;

import java.util.Scanner;

public class Codeup1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a != b ? 1 : 0);
        sc.close();
    }
}
