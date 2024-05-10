package boj.study.H10;

// 수학은 체육과목입니다 : https://www.acmicpc.net/problem/15894


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.println(4 * n);
    }
}