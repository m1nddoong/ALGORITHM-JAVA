package BOJ.step.H08_일반수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수 T 입력
        int T = Integer.parseInt(reader.readLine());

        // 거스름돈 정보를 담을 배열
        int[][] charge = new int[T][4];

        // T 만큼 C(단위 센트) 받기
        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(reader.readLine()); // C = 25 센트 -> 0.25달러
            if (1 <= C && C <= 500) {
                // 거스름돈 돌려주기
                // 쿼터 -> 다임 -> 니켈 -> 페니 순
                charge[i][0] = C / 25;
                charge[i][1] = C % 25 / 10;
                charge[i][2] = C % 25 % 10 / 5;
                charge[i][3] = C % 25 % 10 % 5;
            }
        }

        // 출력
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(charge[i][j] + " ");
            }
            System.out.println();
        }
    }
}
