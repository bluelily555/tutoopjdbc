package week3.day3;

public class IsPrimeHalf {
    public static void main(String[] args) {
        int num = 50;
        int answer = 0;
        for (int i = 2; i <= num / 2; i++) {
            if(num / i == 0) answer++;
        }
    }
}
