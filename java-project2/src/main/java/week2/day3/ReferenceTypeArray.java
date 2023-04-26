package week2.day3;

import week1.day5.PrintHello;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[2];

        Object obj = new Student();
        Object obj2 = new PrintHello();

        students[0] = new Student();
        students[0].name = "김경록";
        students[0].phonenumber = "010-1234-5678";
        students[0].age = 37;
        students[1] = new Student();
        students[1].name = "김지유";
        students[1].phonenumber = "010-2468-1357";
        students[1].age = 2;



    }
}
