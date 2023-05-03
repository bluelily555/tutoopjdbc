package codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callCnt = sc.nextInt();
        int[] callArr = new int[callCnt];

        for (int i = 0; i < callCnt; i++) {
            callArr[i] = sc.nextInt();
        }

        for(int i = callCnt-1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if(callArr[j] >  callArr[j+1]){
                    int temp = callArr[j];
                    callArr[j] = callArr[j+1];
                    callArr[j+1] = temp;
                }

            }
        }

        System.out.println(callArr[0]);
    }
}
