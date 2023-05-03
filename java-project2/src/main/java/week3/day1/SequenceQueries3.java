package week3.day1;

import java.util.Arrays;

public class SequenceQueries3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        System.out.println(Arrays.toString(Solution1.solution(arr, queries)));
    }
}
class Solution1 {
    public static int[] solution(int[] arr, int[][] queries){
        int[] answer = {};

        for(int i = 0; i < queries.length; i++){
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = temp;
        }
        answer = arr;
        return answer;
    }
}
