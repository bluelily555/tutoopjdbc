package codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        do {
            answer = 0;
            while(number / 10 != 0){
                answer += number % 10;
                number /= 10;
            }
            answer += number;
            System.out.println(answer);
            if(answer >= 10) number = answer;
        } while(answer >= 10);
        System.out.println();
        System.out.println(answer);
    }
}
