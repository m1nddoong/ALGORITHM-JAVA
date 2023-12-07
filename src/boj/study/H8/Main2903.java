package boj.study.H8;

// 중앙 이동 알고리즘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // N 주어진다 (1 <= N <= 15)
        int N  = Integer.parseInt(reader.readLine());

        if (1 <= N && N <= 25) {
            // 늘어날 한변의 길이 계산
            int oneSide= 2;
            for (int i = 0; i < N; i++) {
                oneSide += (int) Math.pow(2, i);
            }
            System.out.println((int) Math.pow(oneSide, 2));
        }
    }
}


