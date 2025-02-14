package BOJ.step.H12_브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 브루트포스 - 설탕 배달 : https://www.acmicpc.net/problem/2839
public class Main2839 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (true) {
            // N = 1 or 2 일때
            if (N % 5 == 0) {
                System.out.println(N / 5 + count);
                break;
            } else if (N < 0) {
                System.out.println(-1);
                break;
            }
            N -= 3;
            count++;
        }
    }
}



