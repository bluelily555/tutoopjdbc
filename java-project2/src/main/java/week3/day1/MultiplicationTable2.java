package week3.day1;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++){
           for(int j = 1;  j < 10; j++){
               System.out.printf("%d * %d = %d\n", i, j, i * j);
           }

        }
    }
}
