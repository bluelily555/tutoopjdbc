package week2.day5;

import java.util.Arrays;
import java.util.Scanner;

public class HallOfFame {
    public static void main(String[] args) {
        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(Solution1.solution(k1, score1)));

        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(Solution1.solution(k2, score2)));


    }
}

class Solution1 {
    public static int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        int[] hallOfFame = new int[k];

        for(int i = 0; i < score.length; i++) {//날짜
            if (i == 0) {
                answer[i] = score[i];
                hallOfFame[i] = score[i];
            } else if (i < k) {
                for (int j = i; j > -1; j--) { //명예의 전당이 아직 꽉 차지 않은 경우
                    if (hallOfFame[j] < score[i]) {
                        if (j == i) hallOfFame[j] = score[i];
                        else {
                            hallOfFame[j + 1] = hallOfFame[j];
                            hallOfFame[j] = score[i];
                        }
                    }
                }
                answer[i] = hallOfFame[i];
            } else {
                for (int j = k - 1; j > -1; j--) {//명예의 전당 역순으로 비교 (k-1이 최하위점수)
                    if (hallOfFame[j] < score[i]) { //오늘 새로 나온 점수와 명예의 전당 비교
                        if(j == k-1) hallOfFame[j] = score[i];
                        else{
                            hallOfFame[j + 1] = hallOfFame[j];
                            hallOfFame[j] = score[i];
                        }
                    }
                }
                answer[i] = hallOfFame[k - 1];
            }
        }

        return answer;
    }
}