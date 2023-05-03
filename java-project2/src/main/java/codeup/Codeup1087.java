package codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stopNumber = sc.nextInt();

        int answer = 0;
        int n = 1;

        while(true){
            answer += n++;
            if(answer >= stopNumber) break;
        }

        System.out.println(answer);
    }
}
