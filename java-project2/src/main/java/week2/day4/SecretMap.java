package week2.day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretMap {
    public static void main(String[] args) {
        int n1 = 5;
        int[] n1arr1 = {9, 20, 28, 18, 11};
        int[] n1arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(Solution.solution(n1, n1arr1, n1arr2)));

        int n2 = 6;
        int[] n2arr1 = {46, 33, 33 ,22, 31, 50};
        int[] n2arr2 = {27 ,56, 19, 14, 14, 10};

        System.out.println(Arrays.toString(Solution.solution(n2, n2arr1, n2arr2)));
    }
}

class Solution{
    public static String[] solution(int n, int[] arr1, int[] arr2){

        String[] answer = new String[n];

        for(int i = 0; i < n; i++){
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            int idx = temp.length()-1;
            String result = "";
            for(int j = 0; j < n; j++){
                if(idx > -1) {
                    if(temp.charAt(idx) == '0') result = " " + result;
                    else result = "#" + result;
                } else result = " " + result;

                idx--;
            }
            answer[i] = result;
        }

        return answer;
    }
}
