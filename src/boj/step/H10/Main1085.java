package boj.step.H10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 직사각형에서 탈출 : https://www.acmicpc.net/problem/1085
public class Main1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        // 한수 자표
        int x = Integer.parseInt(input.split(" ")[0]);
        int y = Integer.parseInt(input.split(" ")[1]);
        // 직사각형 꼭짓점 좌표
        int w = Integer.parseInt(input.split(" ")[2]);
        int h = Integer.parseInt(input.split(" ")[3]);

        // x축, y축간 거리 최소 들중 작은 값 출력
        int mixX = Math.min(x, (w - x));
        int minY = Math.min(y, (h - y));
        System.out.println(Math.min(mixX, minY));

    }
}
