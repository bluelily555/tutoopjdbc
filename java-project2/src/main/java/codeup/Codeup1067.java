package codeup;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input > 0) System.out.println("plus");
        else System.out.println("minus");

        if(input % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}
