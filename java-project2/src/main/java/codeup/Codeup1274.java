package codeup;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if(number % i == 0) prime = false;
        }

        if(prime) System.out.println("prime");
        else System.out.println("not prime");

    }
}
