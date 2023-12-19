package boj.study.H15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[2];
        int[] B = new int[2];
        for (int i = 0; i < 2; i++) {
            String input = reader.readLine();
            A[i] = Integer.parseInt(input.split(" ")[0]);
            B[i] = Integer.parseInt(input.split(" ")[1]);
        }
        // 두 분모의 최소 공배수 구하기
        int min = Math.min(B[0], B[1]);
        int max = Math.max(B[0], B[1]);
        int denominator = 0; // 분모
        for (int i = 1; i < max+1; i++) {
            if ((min * i) % max == 0) {
                // 분모 : 최소 공배수 구하기
                denominator = min * i;
                break;
            }
        }
        // 분자 : (분모의 최소 공배수 / 각 분모의 값) * 각 분자
        int numerator = A[0] * (denominator / B[0]) + A[1] * (denominator / B[1]);

        // 분모 분자의 최대공약수로 각각 분모 분자를 나눠주고 최종적으로 기약분수로 출력하기
        int finalMin = Math.min(denominator, numerator);
        int finalMax = Math.max(denominator, numerator);
        int greatestCd = 1;
        for (int i = 1; i < finalMin+1; i++) {
            if (finalMax % i == 0 && finalMin % i == 0) {
                if (i > greatestCd) greatestCd = i;
            }
        }
        System.out.println(numerator / greatestCd + " " + denominator / greatestCd);
    }
}
