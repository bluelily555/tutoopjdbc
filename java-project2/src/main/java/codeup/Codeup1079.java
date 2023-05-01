package codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        while(!str.equals("q")){
            System.out.println(str);
            str = sc.next();
        }
        System.out.println(str);
    }
}
