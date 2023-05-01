package codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = 0;

        for(int i = 0; i <= input; i++){
            if(i % 2 == 0) result += i;
        }

        System.out.println(result);
    }
}
