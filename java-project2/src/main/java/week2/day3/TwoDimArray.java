package week2.day3;

import java.util.Arrays;

public class TwoDimArray {
    //메서드로 리팩토링 (리팩토링 = 구조 바꾸기)
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-----------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[] arr0 = arr[0];
        arr0[0] = 1 ;

        printArray(arr);

        System.out.println();
        System.out.println();

        //책 p.154 TwoDimArrSetValue 부분
        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;

        printArray(arr);
    }
}
