package codeup;

import java.util.Scanner;

public class Codeup1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println(input1 == 1 || input2 == 1 ? 1 : 0);
        sc.close();
    }
}
