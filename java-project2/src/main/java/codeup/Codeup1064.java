package codeup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        System.out.println(input1 > input2 ? (input2 > input3 ? input3 : input2) : (input1 > input3 ? input3 : input1));
    }
}
