package codeup;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callCnt = sc.nextInt();
        int[] callArr = new int[callCnt];

        for (int i = 0; i < callArr.length; i++) {
            callArr[i] = sc.nextInt();
        }

        int[] stdArr = new int[23];
        for(int i: callArr){
            stdArr[i-1]++;
        }

        for (int i: stdArr) {
            System.out.printf("%d ", i);
        }
    }
}
