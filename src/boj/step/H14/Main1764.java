package boj.step.H14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formattable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

// 듣보잡 : https://www.acmicpc.net/problem/1764
public class Main1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (set.contains(input)) {
                result.add(input);
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(result);
        sb.append(result.size()).append('\n');
        for (String s : result) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);

    }
}
