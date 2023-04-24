package codeup;

import java.util.Scanner;

public class Codeup1022 {
    public static void main(String[] args) {
        char[] data = new char[2001];
        Scanner sc = new Scanner(System.in);

        data = sc.nextLine().toCharArray();

        for(int i = 0; i < data.length; i++){
            System.out.printf("%s", data[i]);
        }
    }
}
