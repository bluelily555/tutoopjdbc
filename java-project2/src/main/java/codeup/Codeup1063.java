package codeup;

import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println(input1 > input2 ? input1 : input2);
        sc.close();
    }
}
