package week3.day2;

public class NumberHandling {
    public static void main(String[] args) {
        int[] log={0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(Solution.solution(log));

    }
}
class Solution {
    public static String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i-1]){
                case 1 -> answer += "w";
                case -1 -> answer += "s";
                case 10 -> answer += "d";
                case -10 -> answer += "a";
            }
        }
        return answer;
    }
}
