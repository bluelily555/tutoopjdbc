package week2.day5;

public class SwichCaseEx {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        switch (dayOfWeek){  //break를 사용하지 않은 경우
            case 1:
                System.out.println("월요일");
            case 2:
                System.out.println("화요일");
            default:
                System.out.println(dayOfWeek + "에 해당하는 요일은 없습니다.");
        }
    }
}
