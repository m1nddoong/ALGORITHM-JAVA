package boj.study.H14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        Set<String> S = new HashSet<>();

        // 집합 S
        for (int i = 0; i < N; i++) {
            S.add(reader.readLine());
        }

        int included = 0;
        for (int i = 0; i < M; i++) {
            if (S.contains(reader.readLine())) { // 입력 받은 문자열을 S 집합에 포함하고 있다면
                included++;
            }
        }
        System.out.println(included);
    }
}
