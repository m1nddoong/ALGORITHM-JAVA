package boj.step.H4;

// 평균 : https://www.acmicpc.net/problem/1546

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시험 본 과목 수 N
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = -1;
        double[] score = new double[N];

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (score[i] > max)
                max = score[i];
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = score[i] / max * 100;
            sum += score[i];
        }
        System.out.println(sum / N);

    }
}
