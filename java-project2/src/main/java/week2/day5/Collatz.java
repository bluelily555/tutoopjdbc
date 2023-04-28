package week2.day5;

public class Collatz {
    public static void main(String[] args) {
        int input1 = 6;
        System.out.println(Solution.solution(input1));
        int input2 = 16;
        System.out.println(Solution.solution(input2));
        int input3 = 626331;
        System.out.println(Solution.solution(input3));
    }
}

class Solution {
    public static int solution(int num) {
        int answer = 0;
        long number = (long) num;
        while(number != 1l && answer < 500){
            answer++;
            if(number % 2l == 0){
                number /= 2l;
            } else {
                number = (number * 3l) + 1l;
            }
        }

        if (answer < 500) return answer;
        else return -1;
    }
}