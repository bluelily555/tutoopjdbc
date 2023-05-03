package week3.day1;

public class LoopCharHangle {
    public static void main(String[] args) {
        //한글로 loop시켜보기
        for(char c = '가'; c <= '힣'; c++){
            System.out.printf("%c ", c);
        }
        //이건 에러남
//        for(char c = '가'; c <= '하'; c++){
//            System.out.printf("%d ", c);
//        }
    }
}
