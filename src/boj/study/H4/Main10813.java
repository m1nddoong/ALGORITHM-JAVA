package boj.study.H4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        int[] arr = new int[N]; // 0 1 2 3 4 배열에 1 2 3 4 5 숫자 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        for (int k = 0; k < M; k++) {
            input = br.readLine();
            int i = Integer.parseInt(input.split(" ")[0]) - 1;
            int j = Integer.parseInt(input.split(" ")[1]) - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < N; i++) {
            builder.append(arr[i]).append(" ");
        }
        System.out.println(builder);

    }
}