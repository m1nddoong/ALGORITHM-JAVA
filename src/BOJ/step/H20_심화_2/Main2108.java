package BOJ.step.H20_심화_2;

// 통계학 : https://www.acmicpc.net/problem/2108

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        // 1. 산술평균
        sb.append(Math.round((float) sum / N)).append("\n");
        // 2. 중앙값
        Arrays.sort(arr);
        sb.append(arr[N/2]).append("\n");

        // -3 -2 -2 -1 -1
        // 3. 최빈값
        int count = 0;
        int max = -1;
        int mod = arr[0]; // 처음 최빈값을 배열의 첫번쨰 값으로 설정
        boolean check = false;
        for (int i = 0; i < N-1; i++) {
            // 정렬되어있는 배열에서 인접한 두 요소가 같으면 count 1증가 -> 이는 곳 빈도수를 의미
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count=0;
            }
            if (max < count) { // 최대 빈도수를 구하는 과정
                max = count;
                mod = arr[i]; // 그때의 최빈값을 mod 에 저장
                check = true;
            } else if (max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }
        sb.append(mod).append("\n");
        // 4. 범위
        sb.append(arr[N-1] - arr[0]).append("\n");
        System.out.println(sb);
    }
}
