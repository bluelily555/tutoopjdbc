package week3.day3;

public class ZeroOrFive {
//    public static boolean isZeroOrFive(int num){
//        while (num > 0){
//            if(num % 10 != 5 && num % 10 != 0){
//                return false;
//            }
//
//            num /= 10;
//        }
//        return true;
//    }
    public static void main(String[] args) {
        int num = 253;

        String flagText = "0 또는 5로만 이루어진 숫자입니다.";

        while (num > 0){
            if(num % 10 != 5 && num % 10 != 0){
                flagText = "0 또는 5로만 이루어진 숫자입니다.";
                break;
            }
            num /= 10;
        }

        System.out.println(flagText);
    }
}
