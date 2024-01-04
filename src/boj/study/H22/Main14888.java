package boj.study.H22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자 끼워넣기 : https://www.acmicpc.net/problem/14888
public class Main14888 {
    public static int MAX = Integer.MIN_VALUE;    // 최댓값
    public static int MIN = Integer.MAX_VALUE;    // 최솟값
    public static int[] operator = new int[4];    // 연산자 개수
    public static int[] number;                    // 숫자
    public static int N;                        // 숫자 개수

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수의 개수 N
        N = Integer.parseInt(br.readLine());
        number = new int[N];

        // 숫자 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        // N-1 개의 연산자 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N-1; i++) {

        }

    }

}
