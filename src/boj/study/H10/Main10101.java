package boj.study.H10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 삼각형 외우기 : https://www.acmicpc.net/problem/10101
public class Main10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());

        if (A == 60 && B == 60 && C == 60) {
            System.out.println("Equilateral");
        } else if (A + B + C == 180) {
            if ((A == B || B == C || C == A)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
