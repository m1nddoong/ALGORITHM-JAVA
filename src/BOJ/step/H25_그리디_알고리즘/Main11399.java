package BOJ.step.H25_그리디_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 회의실 배정 : https://www.acmicpc.net/step/33
public class Main11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] times = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(times);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // System.out.print(times[i] + " ");
            times[i+1] += times[i];
            sum += times[i+1];
        }
        System.out.println(sum);
    }
}
