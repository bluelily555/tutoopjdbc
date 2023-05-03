package week3.day1;

public class MultiplicationTable {
    public static void printDan(int dan){
        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
    }

    public static void main(String[] args) {
        int[] dan = {2, 4, 8, 9};

        for(int j = 0; j < dan.length; j++){
            for (int i = 1; i < 10; i++){
                System.out.printf("%d * %d = %d\n", dan[j], i, dan[j] * i);

            }
            System.out.println("========================");
        }

        System.out.println("메서드 활용 버전");

        printDan(2);
        System.out.println();
        printDan(4);
        System.out.println();
        printDan(8);
        System.out.println();
        printDan(9);
    }
}
