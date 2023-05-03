package week3.day2;

public class Digits {
    public static void main(String[] args) {
        int num = 45634;

        int cnt = 0;
        while(num / 10 != 0){
            cnt++;
            num /= 10;
        }
        System.out.println(++cnt);
    }
}
