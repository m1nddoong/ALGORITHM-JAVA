package LikeLion.d5lecture;

/*
    덩치 : https://www.acmicpc.net/problem/7568
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main19532 {

    // 덩치 등수 구하기 < 조합 : N개 중에서 2개 고르기>
    public static void combBody(int n) { // n_C_2
        int first; // 조합의 첫번쨰 숫자
        int second; // 조합의 두번째 숫자

        for (int i = 0; i < n - 1; i++) {
            // 첫번쨰 숫자 고르기
            first = i;
            for (int j = first + 1; j < n; j++) {
                // 두번째 숫자 고르기
                second = j;
                System.out.println(first + " " + second);
            }
        }

    }



    public static void main(String[] args) throws IOException {
        // 전체 사람의 수 N 입력받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int n = Integer.parseInt(input);

        // 몸무게와 키를 저장할 2차원 배열
        int[][] bodyInfo = new int[n][2];


        // N번 반복하여 (몸무게, 키) 를 나타내는 x, y 입력받기
        for (int i = 0; i < n; i++) {
            // 0 열은 몸무게, 1열은 키
            input = reader.readLine();
            bodyInfo[i][0] = Integer.parseInt(input.split(" ")[0]); // x
            bodyInfo[i][1] = Integer.parseInt(input.split(" ")[1]); // y
        }

        combBody(n);

//        for (int i = 0; i < N; i++) {
//            // i = 0~4까지 순회하면서,
//            // 몸무게 비교 : 그떄의 bodyInfo[i][0] 값들을 비교
//            // 키 비교 : 그떄의 bodyInfo[i][1] 값들을 비교
//
//            for (int j = 0; j < 2; j++) {
//
//            }
//        }
    }
}
