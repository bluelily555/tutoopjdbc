package week2.day1;

public class NumberFormatException1 {
    public static void main(String[] args) {
        //런타임에러 나는 코드
        String str = "123ab"; //숫자가 아닌 문자열
        int num = Integer.parseInt(str); //컴파일은 되지만 런타임에러 발생 NumberFormatException 발생.
    }
}
