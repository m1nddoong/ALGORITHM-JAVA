package boj.step.H5;

// 상수 : https://www.acmicpc.net/problem/2908

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer((br.readLine()));
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 3자리 수 이니까 그냥 100의 자리 숫자랑 1의 자리 숫자를 바꿔주자
        // 100의 자리 : A / 100
        // 10의 자리 : A % 100 / 10
        // 1의 자리 : A % 10

        int newA = 100 * (A % 10) + 10 * (A % 100 / 10) + A / 100;
        int newB = 100 * (B % 10) + 10 * (B % 100 / 10) + B / 100;
        int big = Math.max(newA, newB);
        System.out.println(big);

    }
}
