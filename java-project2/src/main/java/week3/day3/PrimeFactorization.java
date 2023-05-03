package week3.day3;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n1 = 12;
        System.out.println(Solution.solution(n1));
        System.out.println();
        int n2 = 17;
        System.out.println(Solution.solution(n2));
        System.out.println();
        int n3 = 420;
        System.out.println(Solution.solution(n3));
    }
}

class Solution {
    public static int[] solution(int n) {
        int cnt = 0;
        for (int i = 2; i <= n ; i++) {
            if(n % i == 0) cnt++;
        }
        int[] answer = new int[cnt];


        return answer;
    }
}