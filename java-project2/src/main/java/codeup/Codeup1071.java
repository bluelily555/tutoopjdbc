package codeup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        //for문을 while문처럼 쓰기
        for(int i = 0; input != 0; i++){
            System.out.println(input);
            input = sc.nextInt();
        }

//        while(input != 0){
//            System.out.println(input);
//            input = sc.nextInt();
//        }
    }
}
