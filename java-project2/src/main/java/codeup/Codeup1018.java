package codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String time = sc.next();
        String[] timeArray = time.split(":");

        System.out.println(timeArray[0] + ":" + timeArray[1]);
    }
}
