package boj.study.H9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        // 약수들을 담을 List 생성
        List<Integer> list = new ArrayList<>();

        while ((1 <= N && N <= 10000) && (1 <= K && K <= N)) {
            // N 의 약수 구하기 : 주어진 N 을 1부터 N꺼지 나눴을 때 나머지가 0인 것이 약수들이다.
            for (int i = 1; i < N + 1; i++) {
                if (N % i == 0)
                    list.add(i);
            }

            // N 의 약수중 K 번째로 작은 수 출력하기
            if (list.size() < K) {
                System.out.println(0);
                break;
            } else {
                System.out.println(list.get(K - 1));
                break;
            }
        }
    }
}
