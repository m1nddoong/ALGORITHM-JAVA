package boj.step.H4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 나머지 : https://www.acmicpc.net/problem/3052
public class Main3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 42로 나누었을떄의 나머지를 인덱스로 하는 배열
        int[] arr = new int[1001];


        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(br.readLine()) % 42;
            arr[index]++;
        }
        // 배열에서 값이 1인 것 카운트
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count++;
        }
        System.out.println(count);
    }
}
