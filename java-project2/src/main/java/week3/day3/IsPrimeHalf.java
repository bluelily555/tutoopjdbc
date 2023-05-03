package week3.day3;

public class IsPrimeHalf {
    public static void main(String[] args) {
        int num = 53;
        int cnt = 0;
        for (int i = 2; i < num / 2; i++) {
            if(num % i == 0) cnt++;
        }

        if(cnt != 0) System.out.println("소수가 아닙니다.");
        else System.out.println("소수입니다");
    }
}
