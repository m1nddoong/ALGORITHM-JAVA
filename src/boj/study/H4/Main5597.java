package boj.study.H4;

// 과제 안 내신 분..?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5597 {
    public static void main(String[] args) throws IOException {
        int[] students = new int[30]; // 0~29까지의 인덱스
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 28; i++) {
            int idx = Integer.parseInt(br.readLine());
            students[idx-1] = idx;
        }
        for (int i = 0; i < 30; i++) {
            if(students[i] == 0) sb.append(i+1).append("\n");
        }
        System.out.println(sb);
    }
}
