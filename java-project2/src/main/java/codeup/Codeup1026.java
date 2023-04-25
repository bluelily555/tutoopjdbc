package codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] strArr = str.split(":");
        System.out.println(Integer.parseInt(strArr[1]));

        sc.close();
    }
}
