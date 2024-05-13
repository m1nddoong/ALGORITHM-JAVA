package boj.study.H11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알고리즘 수업 - 알고리즘의 수행 시간 4 : https://www.acmicpc.net/problem/24265
public class Main24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        System.out.println(n * (n-1) / 2);
        System.out.println(2);
    }
}
