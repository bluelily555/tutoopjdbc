package week2.day3;

import java.util.Arrays;

public class TenxTen {
    public static void main(String[] args) {
        int[][] iArr = new int[10][10];

        System.out.println(Arrays.toString(iArr[0]));
        System.out.println(Arrays.toString(iArr[1]));
        System.out.println(Arrays.toString(iArr[2]));
        System.out.println(Arrays.toString(iArr[3]));
        System.out.println(Arrays.toString(iArr[4]));
        System.out.println(Arrays.toString(iArr[5]));
        System.out.println(Arrays.toString(iArr[6]));
        System.out.println(Arrays.toString(iArr[7]));
        System.out.println(Arrays.toString(iArr[8]));
        System.out.println(Arrays.toString(iArr[9]));

        System.out.println();
        System.out.println();

        for(int i = 0; i < iArr.length; i++){
            System.out.println(Arrays.toString(iArr[i]));
        }
    }
}
