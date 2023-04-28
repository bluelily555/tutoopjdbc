package codeup;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subExp = sc.nextLine().split("H");

        int cWeight = Integer.parseInt(subExp[0].substring(1)) * 12;
        int hWeight = Integer.parseInt(subExp[1]);

        System.out.printf("%d", cWeight + hWeight);


    }
}
