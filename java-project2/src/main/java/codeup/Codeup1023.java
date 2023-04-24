package codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] array = str.split("\\.");

        System.out.printf("%d\n", Integer.parseInt(array[0]));
        System.out.printf("%d", Integer.parseInt(array[1]));
    }
}
