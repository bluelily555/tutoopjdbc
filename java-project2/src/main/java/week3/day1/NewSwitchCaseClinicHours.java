package week3.day1;

public class NewSwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "토";
        String time = switch (day){
            case "월", "화", "수", "목", "금" -> "09:00~18:00";
            case "토" -> "09:00~13:00";
            case "일" -> "휴진";
            default -> throw new IllegalArgumentException("해당 요일은 존재하지 않습니다.");
        };

        System.out.printf("%s요일 진료시간은 %s입니다.", day, time);
    }
}
