package boj.step.H14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// 집합과 맵 : 대칭 차집합 - https://www.acmicpc.net/problem/1269
public class Main1269 {
    public static HashSet<Integer> A;
    public static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        // 집합 A, B의 원소의 개수 N, M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 대칭차집합의 개수 : (N + M) - (A와B집합의 중복된 원소의 개수)
        A = new HashSet<>();
        // 집합 A의 원소 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }
        // 집합 A의 원소를 집합 B의 원소와 비교
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 만약 중복된 값이 있다면 result 리스트에 삽입
            if (A.contains(num)) {
                result++;
            }
        }
        System.out.println(N+M - result * 2);

    }
}
