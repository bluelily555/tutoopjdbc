package week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        //나머지를 먼저하고 그 뒤에 몫을 구해야함.

        while(num > 0){
            answer = answer + (num % 10);
            num = num / 10;
        }

        System.out.println(answer);

    }

}
