package week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    //도전과제: 배열과 원하는 행을 넣으면 해당 행을 1로 채워주는 메서드 만들기.....?
    public static void fillRow(int[][] arr, int rowNum){
        for(int i = 0; i < arr[0].length; i++){
            arr[rowNum][i] = 1;
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 1;
        arr[2][4] = 1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));

        System.out.println();
        System.out.println();

        fillRow(arr,4);
    }
}
