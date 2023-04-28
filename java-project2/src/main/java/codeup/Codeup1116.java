package codeup;

import java.util.Scanner;

public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("%d+%d=%d\n", x, y, x + y);
        System.out.printf("%d-%d=%d\n", x, y, x - y);
        System.out.printf("%d*%d=%d\n", x, y, x * y);
        System.out.printf("%d/%d=%d\n", x, y, x / y);
    }
}
