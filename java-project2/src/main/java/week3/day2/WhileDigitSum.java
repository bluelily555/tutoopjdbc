package week3.day2;
import java.util.*;
public class WhileDigitSum {
    public static void main(String[] args) {
        int n1 = 123;
        System.out.println(Solution2.solution(n1));

        int n2 = 987;
        System.out.println(Solution2.solution(n2));

    }
}
class Solution2 {
    public static int solution(int n) {
        int answer = 0;

        while(n / 10 != 0){
            answer += n % 10;
            n /= 10;
        }
        answer += n;
        return answer;
    }
}