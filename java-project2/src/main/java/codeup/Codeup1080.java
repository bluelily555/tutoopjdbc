package codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 1;
        int step = 1;
        while (sum < input){
            step++;
            sum += step;
        }

        System.out.println(step);
    }
}
