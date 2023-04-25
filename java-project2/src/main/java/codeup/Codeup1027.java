package codeup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = str.split("\\.");

        System.out.printf("%02d-%02d-%04d", Integer.parseInt(strArr[2]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[0]));
        sc.close();
    }
}
