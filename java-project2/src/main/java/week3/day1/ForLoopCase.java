package week3.day1;

public class ForLoopCase {
    public static void main(String[] args) {
        //조건식 활용
        for (int i = 2; 2 * i < 18; i++) {
            System.out.println(i);
        }
        //무한루프
        for (int i = 0; 1 == 1; i++) {
            System.out.println();
        }
    }
}
