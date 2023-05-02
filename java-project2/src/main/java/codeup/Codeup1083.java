package codeup;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String check = Integer.toString(i);
            int cnt = 0;

            for (int j = 0; j < check.length(); j++) {
//                switch (Integer.parseInt(check.substring(j,j+1))){
//                    case 3, 6, 9:
//                        cnt++;
//                        break;
//                }
                int temp = Integer.parseInt(check.substring(j,j+1));
                if(temp == 3 || temp == 6 || temp ==9) cnt++;
            }
            if(cnt == 0) System.out.printf("%d ", i);
            else {
                for (int j = 0; j < cnt; j++) {
                    System.out.printf("X");
                }
                System.out.printf(" ");
            }

        }
    }
}
