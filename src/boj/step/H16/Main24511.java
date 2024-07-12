package boj.step.H16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;



public class Main24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 자료구조의 개수 N이 주어진다
        int N = Integer.parseInt(br.readLine());

        // 길이 N의 수열 A가 주어진다. i번 자료구조가 큐라면 Ai = 0, 스택이라면 Ai = 1 이다.
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 길이 N의 수열 B가 주어진다. i번 자료구조에 들어있는 원소
        Deque<Integer> dq = new ArrayDeque<>();
        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입할 수열의 길이 M
        // queuestack에 삽입할 원소를 담고 있는 길이 M의 수열 C가 주어진다.
        int M = Integer.parseInt(br.readLine());
        int[] C = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                dq.addLast(nums[i]);
            }
        }

        for (int i = 0; i < M; i++) {
            dq.addFirst(C[i]);
            sb.append(dq.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
