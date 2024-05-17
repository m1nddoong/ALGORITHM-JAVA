package boj.step.H10;

// 직사각형 : https://www.acmicpc.net/problem/27323

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        System.out.println(A*B);
    }
}
