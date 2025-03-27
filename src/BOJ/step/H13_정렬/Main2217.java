package BOJ.step.H13_정렬;

import java.io.*;
import java.util.*;

// [실버 4] 로프 : https://www.acmicpc.net/problem/2217
public class Main2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        // 모든 로프를 사용할 필요는 없음
        // 높은순서대로 하나씩 선택하고
        // 15 10 로프가 주어졌을 때 10 로프를 선택했다는건 15와 10을 같이 쓴다는 의미
        // 이때 10 을 선택하면 15와 병렬로 처리하여 10 * {사용 로프 개수} 만큼의 중량을 들 수 있게 되는것
        // 인덱스는 전채 길이에서 현재 로프의 인덱스(i) 를 뺴줘야함

        int max = 0;
        for (int i = ropes.length - 1; i >= 0; i--) {
            max = Math.max(max, ropes[i] * (ropes.length - i));
        }
        System.out.println(max);
    }
}
