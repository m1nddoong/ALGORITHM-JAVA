package boj.study.H4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 나머지 : https://www.acmicpc.net/problem/3052
public class Main3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            // 42로 나눈 나머지를 배열에 삽입
            arr[i] = Integer.parseInt(br.readLine()) % 42;
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
