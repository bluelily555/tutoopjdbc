package week3.day1;

public class GameOfDice {
    public static void main(String[] args) {
        int a1 = 2;
        int b1 = 6;
        int c1 = 1;
        System.out.println(Solution2.solution(a1, b1, c1));

        int a2 = 5;
        int b2 = 3;
        int c2 = 3;
        System.out.println(Solution2.solution(a2, b2, c2));

        int a3 = 4;
        int b3 = 4;
        int c3 = 4;
        System.out.println(Solution2.solution(a3, b3, c3));
    }
}

class Solution2 {
    public static int solution(int a, int b, int c) {
        int answer = 0;

        boolean abSame = false;
        boolean acSame = false;
        boolean bcSame = false;

        for(int i = 0; i < 3; i++){
            if(a == b) abSame = true;
            if(a == c) acSame = true;
            if(b == c) bcSame = true;
        }

        answer = (a + b + c);
        if(abSame || abSame || bcSame) answer *= (a*a + b*b + c*c);
        if(abSame && acSame && bcSame) answer *= (a*a*a + b*b*b + c*c*c);


        return answer;
    }
}