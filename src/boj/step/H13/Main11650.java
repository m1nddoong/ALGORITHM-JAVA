package boj.step.H13;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;


// 정렬 - 좌표 정렬하기 :  https://www.acmicpc.net/problem/11650
public class Main11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 좌표를 입력받을 2차원 배열
        int[][] arr = new int[N][2];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        /*
        // Comparator에 대해 익명 클래스 생성
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                // 만약 첫번쨰 원소가 같다면
                if (e1[0] == e2[0]) {
                    // 두 번쨰 원소를 기준으로 오름차순
                    return e1[1] - e2[1];
                } else {
                    // 첫 번째 원소를 기준으로 오름차순
                    return e1[0] - e2[0];
                }
            }
        });
        */

        // compare() -> T[] 타입을 가진 매개변수를 람다식으로 바꾸기
        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }
            else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);

    }
}

