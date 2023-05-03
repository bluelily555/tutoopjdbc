package codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person1 = sc.nextInt();
        int person2 = sc.nextInt();
        int person3 = sc.nextInt();


        //다른 방법 필요.. 밖에 메서드 안 만들고 하는 방법 있나?
        int number1 = person1;
        int number2 = person2;
        while(number2 != 0){
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        int gcd1 = number1;
        int lcm1 = person1 * person2 / gcd1;

        int number3 = person3;
        int tempN = lcm1;
        while(number3 != 0){
            int temp = tempN % number3;
            tempN = number3;
            number3 = temp;
        }
        int gcd2 = tempN;
        int lcm2 = lcm1 * person3 / gcd2;

        System.out.println(lcm2);
    }
}
