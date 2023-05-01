package week3.day1;

public class SumOfAttachNumber {
    public static void main(String[] args) {
        int[] numList1 = {3, 4, 5, 2, 1};
        System.out.println(Solution.solution(numList1));

        int[] numList2 = {5, 7, 8, 3};
        System.out.println(Solution.solution(numList2));
    }
}
class Solution {
    public static int solution(int[] numList) {
        int answer = 0;
        int oddCnt = 0;
        int evenCnt = 0;
        int odd = 0;
        int even = 0;

        int[] oddList = new int[numList.length];
        int[] evenList = new int[numList.length];
        for(int i = 0; i < numList.length; i++){
            if(numList[i] % 2 == 0){
                evenList[evenCnt] = numList[i];
                evenCnt++;
            } else {
                oddList[oddCnt] = numList[i];
                oddCnt++;
            }
        }

        int expo = 1;
        for(int i = oddCnt - 1; i > -1; i--){
            odd += oddList[i] * expo;
            expo *= 10;
        }

        expo = 1;
        for(int i = evenCnt - 1; i > -1; i--){
            even += evenList[i] * expo;
            expo *= 10;
        }

        answer = odd + even;
        return answer;
    }
}