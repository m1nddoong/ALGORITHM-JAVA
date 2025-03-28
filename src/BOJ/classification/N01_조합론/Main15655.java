package BOJ.classification.N01_조합론;

import java.util.*;
import java.io.*;
import java.math.*;

// [실버 3] N과 M(6) : https://www.acmicpc.net/problem/15655
public class Main15655 {
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;
    static int n, r;
    static boolean[] visited;
    static int[] output;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        output = new int[r];

        st = new StringTokenizer(br.readLine());
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers); // 오름차순 정렬
        System.out.println("정렬 후 배열 : " + Arrays.toString(numbers));
        System.out.println();

        comb(0, 0); // 먼저 고를 숫자의 인덱스 start = 0, 현재 선택할 자리 depth = 0
        System.out.println(sb.toString());
    }

    public static void comb(int start, int depth) {
        if (depth == r) {
            System.out.println("조합 출력: " + Arrays.toString(output));
            for (int i = 0; i < r; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) { // 현재 선택한 숫자의 인덱스 i
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = numbers[i]; // 결과에 넣기
                System.out.println("output 배열 업데이트: " + Arrays.toString(output));

                comb(i + 1, depth + 1); // 다음 자리 고르기

                visited[i] = false; // 선택했던 숫자 미방문 처리
                System.out.println("백트래킹: visited[" + i + "] = false");
            }
        }
    }
}
