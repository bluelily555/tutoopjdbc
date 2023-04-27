package week2.day3;

public class SwapEx {
    public static void main(String[] args) {
        //오름차순 정렬 알고리즘
        int[] arr = {2,1,4,8,7,6};

        int temp = arr[0]; //덮어쓰기 전에 저장해둘 임시용 변수
        
        arr[0]  = arr[1];
        arr[1]  = temp;

        System.out.println();
    }
}
