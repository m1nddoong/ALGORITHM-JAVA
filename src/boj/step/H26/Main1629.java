package boj.step.H26;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 곱셈 : https://www.acmicpc.net/problem/1629
public class Main1629 {

    public static long C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(A, B));
    }

    public static long pow(long A, long exponnent) {
        // 지수가 1일 경우, A^1 이므로 A 그대로 리턴
        if (exponnent == 1) {
            return A % C;
        }

        // 지수의 절반에 해당하는 A^(exponent / 2)를 구한다.
        long temp = pow(A, exponnent / 2);

        if (exponnent % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        return temp * temp % C;
    }
}
