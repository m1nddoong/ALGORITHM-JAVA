package boj.step.H10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 대지 : https://www.acmicpc.net/problem/9063
public class Main9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arrX[i] = (Integer.parseInt(st.nextToken()));
            arrY[i] = (Integer.parseInt(st.nextToken()));
        }

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int x : arrX) {
            maxX = Math.max(maxX, x);
            minX = Math.min(minX, x);
        }
        for (int y : arrY) {
            maxY = Math.max(maxY, y);
            minY = Math.min(minY, y);
        }
        // (x좌표 최댓값 - 최솟값) * (y좌표 최댓값 - 최솟값)
        System.out.println((maxX - minX) * (maxY - minY));
    }
}