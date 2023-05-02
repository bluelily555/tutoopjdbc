package week3.day1;

public class MakeArray {
    public static void main(String[] args) {
        int l1 = 5;
        int r1 = 555;
        System.out.println();

        int l2 = 10;
        int r2 = 20;
        System.out.println();

        int a = 1;
//        for(int i = 0; i < 3; i++){
//            a *= 10;
//
//            System.out.println(a);
//        }

        while (a < 1000){
            System.out.println(a);
            a *= 10;
        }

    }
}
class Solution3 {
    public int[] solution(int l, int r) {
        //int타입 만으로 문제 해결하기

        int cnt = 0;
        int temp = r;
//
//        int templete = 1;
//        while(templete  * 5 < r){
//            if(templete * 5 > l) {
//
//            }
//        }
        while(temp / 10 > 0){
            temp %= 10;
            cnt++;
        }
        cnt++;
//2의7승
        int[] answer = new int[cnt];

        int templete = 1;
        while(temp < r){
            templete = 5 ;
            templete *= 10;
            templete += 5;

        }


        if(answer.length == 0) return new int[]{-1};
        else return answer;
    }
}