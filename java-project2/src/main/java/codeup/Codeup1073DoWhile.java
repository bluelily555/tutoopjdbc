package codeup;

import java.util.Scanner;

public class Codeup1073DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            number = sc.nextInt();
            if(number == 0)break;
            else System.out.println(number);
        } while (number != 0);
    }
}

