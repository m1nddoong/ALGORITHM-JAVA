package boj.step.H12;

// 브루트 포스 - 영화감독 숌 : https://www.acmicpc.net/problem/1436

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int movieName = 666;
        int count = 1;

        while (N > count) {
            movieName++;

            if (String.valueOf(movieName).contains("666")) {
                count++;
            }
        }
        System.out.println(movieName);
    }
}


