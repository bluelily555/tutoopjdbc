package week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        //String은 같은 내용을 담으려고 하면 한 번만 만듦
        System.out.println("GOLD" == "GOLD");

        //아래 내용이 출력할 값은 false
        String str1 = "GOLD";
        String str2 = "G";

        boolean isSame = str1 == str2;

        System.out.println(isSame);

        System.out.println("GOLD --> " + str1.hashCode());
        System.out.println("G --> " + str2.hashCode());


        String str3 = "GOLD";

        System.out.println("HashCode: " + str1.hashCode() + ", " + str3.hashCode());
        System.out.println("System.identifyHashCode: " + System.identityHashCode(str1) + ", "
                + System.identityHashCode(str3));

        //????????
        //heap에 str1생성할 때 GOLD라는 내용에 대한 해시값 생성, heap에 str1 저장
        //-> str3 생성하기 전 str3의 내용인 GOLD에 대한 해시값 생성
        //-> heap에서 str3의 GOLD 해시값 검색 -> GOLD에 대한 해시값이니까 이미 str1때 만들어진 해시값이 heap에 있음
        //-> 이미 heap에 존재하니까 str3한테는 str1의 주소값 리턴?
    }
}
