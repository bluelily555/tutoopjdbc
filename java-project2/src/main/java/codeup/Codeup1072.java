package codeup;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int[] inputArr = new int[n];

        for(int i = 0; i < n; i++){
            inputArr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(inputArr[i]);
        }
    }
}
