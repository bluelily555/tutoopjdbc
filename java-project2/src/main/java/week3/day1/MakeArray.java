package week3.day1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MakeArray {
    public static void main(String[] args) {
//        int l1 = 60;
//        int r1 = 504;
//        System.out.println(Arrays.toString(Solution3.solution(l1, r1)));
//        System.out.println();
//
//        int l2 = 10;
//        int r2 = 20;
//        System.out.println(Arrays.toString(Solution3.solution(l2, r2)));

        int l = 5;
        int r = 5555;
//
//        int digitCnt = 0;
//        int temp = r;
//
//        while(temp / 10 > 0){
//            temp /= 10;
//            digitCnt++;
//        }
//        digitCnt++;
////        System.out.println(digitCnt);
//        int[] candidate = new int[digitCnt * 2 +1];
//        int[] answer = new int[digitCnt * 2 + 1];
//
//        int templete = 5;
////        candidate[0] = 5;
//        for (int i = 0; i < candidate.length; i++) {
////            System.out.println("candidate[" + i + "]: " + candidate[i]);
//            if(i == 0) {
//                candidate[i] = templete;
//                templete *= 10;
//                candidate[i+1] = templete;
//            }
//            else if(candidate[i] != 0) continue; //값이 이미 들어있으면 스킵
//            else {
//                for (int j = 0; j < i; j++) {
//                    if(i + j >= candidate.length) break;
//                    if(candidate[j] == templete) break;
//                    candidate[i+j] = templete + candidate[j];
//                    System.out.printf("%d, %d, %d, %d\n", i, j, templete, candidate[i+j]);
//                }
//                templete *= 10;
//                if((i+0) *2-1 < candidate.length) candidate[(i+0)*2-1] = templete;
//                System.out.printf("j끝나고 %d, %d, %d\n", i, (i+0)*2-1, templete);
//
//            }
//            System.out.println(Arrays.toString(candidate));
//        }
//        System.out.println(Arrays.toString(candidate));

        LinkedList<Integer> candidate = new LinkedList<>();
        int fiveTenExpo = 5;
        candidate.add(fiveTenExpo);
        while(candidate.getLast() < r){

            int size = candidate.size();
            fiveTenExpo *= 10;
            candidate.add(fiveTenExpo);
            for(int i = 0 ; i < size; i++){
                if(candidate.get(i) == fiveTenExpo) break;
                else {
                    candidate.add(candidate.get(i) + fiveTenExpo);
                }

            }
        }
        for (Integer integer: candidate) {
            System.out.printf("%d,  ", integer);
        }
    }
}
class Solution3 {
    public static int[] solution(int l, int r) {
        //int타입 만으로 문제 해결하기
        int digitCnt = 0;
        int temp = r;

//        while(temp / 10 > 0){
////            System.out.println(temp);
//            temp /= 10;
//            digitCnt++;
//        }
        digitCnt++;
//        System.out.println(digitCnt);

        LinkedList<Integer> candidate = new LinkedList<>();
        int fiveTenExpo = 5;
        while(candidate.getLast() <= r){
            if(candidate.size() == 0){
                candidate.add(fiveTenExpo);
                fiveTenExpo *= 10;
                candidate.add(fiveTenExpo);
            } else {
                for (Integer cInt :
                        candidate) {
                    if(fiveTenExpo == cInt) break;
                    else {
                        candidate.add(cInt + fiveTenExpo);
                    }
                }
            }
        }
        for (Integer integer: candidate) {
            System.out.printf("%d,  ", integer);
        }

//        int[] candidate = new int[r/5];
        int[] answer;

//        for (int i = 0; i < candidate.length; i++) {
//            if(i == 0) {
//                candidate[i] = fiveTenExpo;
//                fiveTenExpo *= 10;
//                candidate[i+1] = fiveTenExpo;
//            }
//            else if(candidate[i] != 0) continue; //값이 이미 들어있으면 스킵
//            else {
//                for (int j = 0; j < i; j++) {
//                    if(i + j >= candidate.length) break;
//                    if(candidate[j] == fiveTenExpo) break;
//                    candidate[i+j] = fiveTenExpo + candidate[j];
//                }
//                fiveTenExpo *= 10;
//                if((i+0) *2-1 < candidate.length) candidate[(i+0)*2-1] = fiveTenExpo;
//
//            }
//        }
//        int idx = 0;
//        for (int i = 0; i < candidate.length; i++) {
//            System.out.println(candidate[i]);
//            if(candidate[i] >= l && candidate[i] <= r) idx++;
//            System.out.println("idx: " + idx);
//        }
//
//        System.out.println(Arrays.toString(candidate));
//
//
//
//        if(idx == 0) return new int[]{-1};
//        else {
//            answer = new int[idx];
//            int idx2 = 0;
//            for (int i = 0; i < candidate.length; i++) {
//                if(candidate[i] >= l && candidate[i] <= r) answer[idx2++] = candidate[i];
//            }
//            return answer;
//        }
        return new int [4];
    }
}