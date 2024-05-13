package boj.study.H11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알고리즘 수업 - 알고리즘의 수행 시간 5 : https://www.acmicpc.net/problem/24266
public class Main24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine()); // 입력의 크기 n(1 ≤ n ≤ 500,000)

        System.out.println(n*n*n);
        System.out.println(3);
    }
}
