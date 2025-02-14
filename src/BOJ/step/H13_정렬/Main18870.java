package BOJ.step.H13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 정렬 - 좌표 압축 : https://www.acmicpc.net/problem/18870
public class Main18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 배열 복사
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(sortedArr);
        // -10 -9 2 4 4

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(sortedArr[i])) {
                map.put(sortedArr[i], index);
                index++;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(arr[i]) + " ");
        }

        System.out.println(sb);

    }
}
