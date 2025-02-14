package BOJ.step.H24_누적_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수열 : https://www.acmicpc.net/problem/2559
public class Main2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];

        // n개의 숫자를 차례대로 받기 누적합 저장
        st = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        int max = -100001;
        int result = 0;
        // 누적합을 기준으로 해답 구하기
        for (int i = k; i <= n; i++) {
            result = arr[i] - arr[i - k];
            if (max < result) {
                max = result;
            }
        }
        System.out.println(max);
    }

}
