package boj.study.H9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기 : https://www.acmicpc.net/problem/1978
public class Main1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > 1) {
                for (int j = 1; j <= 1000; j++) {
                    if (num % j == 0) count++;
                }
                if (count == 2) {
                    total++;
                }
                count = 0;
            }
        }
        System.out.println(total);
    }
}

