package week3.day1;

import java.util.Arrays;

public class SpecialTwoDemArr {
    public static void main(String[] args) {
        int n1 = 3;
        System.out.println(Arrays.toString(Solution4.solution(n1)));
        System.out.println();

        int n2 = 6;
        System.out.println(Arrays.toString(Solution4.solution(n2)));
        System.out.println();

        int n3 = 1;
        System.out.println(Arrays.toString(Solution4.solution(n3)));
    }
}

class Solution4 {
    public static int[][] solution(int n) {
        int[][] answer = new int [n][n];

        for(int i = 0; i < n; i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}