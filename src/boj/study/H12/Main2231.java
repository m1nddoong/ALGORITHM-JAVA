package boj.study.H12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(reader.readLine());
        int dicompositionN = 0;
        int N;
        List<Integer> listN = new ArrayList<>();

        // 000 ~ 999,999 까지 조합
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            for (int n = 1; n <= 9; n++) {
                                // 자연수 N 만들기
                                N = i * 100000 + j * 10000 + k * 1000 + l * 100 + m * 10 + n;
                                // N의 분해합
                                dicompositionN = i + j + k + l + m + n;
                                if (M == N + dicompositionN) {
                                    listN.add(N);
                                }
                            }

                        }
                    }
                }
            }
        }
        int min;
        // 만약 생성자가 없다면
        if (listN.isEmpty()) {
            min = 0;
        } else {
            min = listN.get(0);
            for (int element : listN) {
                if (min >= element) {
                    min = element;
                }
            }
        }
        System.out.println(min);
    }
}
