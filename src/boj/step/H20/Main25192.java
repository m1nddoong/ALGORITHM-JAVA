package boj.step.H20;

// 인사성 밝은 곰곰이 : https://www.acmicpc.net/problem/25192

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                set.clear();
            } else {
                if (set.contains(input)) continue;
                set.add(input);
                count++;
            }
        }
        System.out.println(count);
    }
}
