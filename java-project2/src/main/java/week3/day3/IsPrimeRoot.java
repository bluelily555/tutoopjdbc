package week3.day3;

public class IsPrimeRoot {
    public static void main(String[] args) {
        int num = 66;
        int cnt = 0;

        //에라토스테네스의 체
        //
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) cnt++;
        }

        if(cnt == 0) System.out.println("소수입니다");
        else System.out.println("소수가 아닙니다.");
    }
}
