package codeup;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stopNumber = sc.nextInt();

        int answer = 0;
        int n = 1;

        while (n <= stopNumber){
            if(n % 3 == 0) {
                n++;
                continue;
            }
            System.out.printf("%d ", n++);
        }
    }
}
