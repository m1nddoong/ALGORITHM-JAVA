package boj.step.H13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 나이순 정렬 : https://www.acmicpc.net/problem/10814
public class Main10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 나이, 이름을 저장할 배열
        String[][] arr = new String[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                // 나이가 같으면 가입순
                if (s1[0] == s2[0]) {
                    // 무조건 o1 이 앞에 오도록 양의 정수 1 반환
                    return 1;
                }
                // 나이 순
                else {
                    return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
