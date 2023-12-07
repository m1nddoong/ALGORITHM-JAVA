package boj.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        int N = Integer.parseInt(input);

        if (1 <= N && N <= 100) {
            for (int i = 1; i <= N; i++) {
                // 공백 출력
                for (int j = 0; j < N - i; j++) {
                    System.out.print(" ");
                }

                // 별 출력
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // 아래쪽 부분 출력
            for (int i = N - 1; i >= 1; i--) {
                // 공백 출력
                for (int j = 0; j < N - i; j++) {
                    System.out.print(" ");
                }

                // 별 출력
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}



