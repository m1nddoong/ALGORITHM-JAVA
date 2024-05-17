package boj.step.H25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 회의실 배정 : https://www.acmicpc.net/problem/1931
public class Main1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 회의의 수 n
        int n = Integer.parseInt(st.nextToken());
        int[][] meetings = new int[n][2];

        // n개의 회의 시간 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            // 0열은 회의 시작 시간, 1열은 회의 종료 시간
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());

        }

        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        // Arrays.sort(meetings, Comparator.comparingInt(arr -> arr[1]));

        int count = 0;
        int endTime = 0;
        for (int i = 0; i < n; i++) {
            if (endTime <= meetings[i][0]) {
                endTime = meetings[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
