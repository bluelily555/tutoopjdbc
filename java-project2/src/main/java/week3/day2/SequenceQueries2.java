package week3.day2;

import java.util.Arrays;

public class SequenceQueries2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(Solution5.solution(arr, queries)));
    }
}
class Solution5 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int min = 1_000_000;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                System.out.printf("%d, %d, %b, %b\n", queries[i][2],  arr[j], queries[i][2] < arr[j], arr[j] < min);
                if(queries[i][2] < arr[j] && arr[j] < min) min = arr[j];
            }
            if(min == 1_000_000) answer[i] = -1;
            else answer[i] = min;
        }
        return answer;
    }
}