package boj.PermAndComb;

// 조합론 - 로또 : https://www.acmicpc.net/problem/6603

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9095 {

    static int K;
    static int[] arr, comb;
    static StringBuilder answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            answer = new StringBuilder();
            String str = br.readLine();

            if (str.equals("0")) return;

            StringTokenizer st = new StringTokenizer(str);
            // 첫번쨰 수는 K
            K = Integer.parseInt(st.nextToken());
            // 다음은 집합 S
            arr = new int[K];
            comb = new int[6];
            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            // 집합 S에서 6개 조합하기
            combRecur(0, 0);
            System.out.println(answer);
        }
    }

    public static void combRecur(
            int count,
            int next
    ) {
        if (count == 6) {
            print();
        } else if (next == arr.length) {
            return;
        } else {
            comb[count] = arr[next];
            combRecur(count+1, next+1);
            combRecur(count, next+1);
        }
    }

    // 번호 출력
    private static void print() {
        for (int num : comb) {
            answer.append(num).append(" ");
        }
        answer.append("\n");
    }
}
