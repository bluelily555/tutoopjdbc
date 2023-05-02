package codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();

        int cnt = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                String str = "";
                for (int k = 0; k < blue; k++) {
                    str += i + " " + j + " " + k + "\n";
//                    System.out.printf("%d %d %d\n", i, j, k); ->시간초과
                    cnt++;
                }
                //write하는 위치에 따라서? / 저장된 str의 양에 따라서도 시간 달라짐. 적당한 양 flush하는게 빠름
                bw.write(str);
                bw.flush();
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
