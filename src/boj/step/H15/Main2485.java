package boj.step.H15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 심어진 가로수의 개수 N
        int N = Integer.parseInt(reader.readLine());
        int[] trees = new int[N];
        int[] distances = new int[N-1];
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(reader.readLine());
            if (i > 0) { // 심어진 나무들의 간격
                distances[i-1] = trees[i] - trees[i-1];
            }
        }
        // distance 들의 최대 공약수 구하기 == 최종 간격
        for (int i = 0; i < distances.length-1; i++) {
             distances[i+1] = gcd(distances[i], distances[i+1]);
        }
        // 촤종간격
        int gcd = distances[distances.length - 1];
        // 총 나무의 개수 : (끝 위치 - 처음 위치)/최대 공약수 + 1
        int totalTrees = (trees[N-1] - trees[0]) / gcd + 1;
        // 답 : 총 나무의 개수 - 기존 심어진 나무의 개수
        int answer = totalTrees - N;
        System.out.println(answer);
    }


    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

