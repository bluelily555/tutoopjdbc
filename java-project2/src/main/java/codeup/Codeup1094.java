package codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callCnt = sc.nextInt();
        int[] callArr = new int[callCnt];

        for (int i = 0; i < callCnt; i++) {
            callArr[i] = sc.nextInt();
        }

        int[] reverseCall = new int[callCnt];
        for (int i = 0; i < callCnt; i++) {
            reverseCall[callCnt - 1 - i] = callArr[i];
        }

        for (int i: reverseCall
             ) {
            System.out.printf("%d ", i);
        }
    }
}
