package week2.day4;

public class ComparisonOperatorsEx {
    public static void main(String[] args) {
        int iVal1 = 10;
        int iVal2 = 20;

        boolean result = iVal1 == iVal2;

        System.out.printf("iVal1 == iVal2 --> %b\n", result);
        System.out.printf("iVal1 != iVal2 --> %b\n", iVal1 != iVal2);
        System.out.printf("iVal1 < iVal2 --> %b\n", iVal1 < iVal2);
        System.out.printf("iVal1 <= iVal2 --> %b\n", iVal1 <= iVal2);
        System.out.printf("iVal1 > iVal2 --> %b\n", iVal1 > iVal2);
        System.out.printf("iVal1 >= iVal2 --> %b\n", iVal1 >= iVal2);
    }
}
