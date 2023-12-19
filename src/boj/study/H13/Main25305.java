package boj.study.H13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);
        List<Integer> list = new ArrayList<>();

        String inputScore = reader.readLine();
        for (int i = 0; i < N; i++) {
              list.add(Integer.parseInt(inputScore.split(" ")[i]));
        }
        Collections.sort(list);
        System.out.println(list.get(N-k));
    }
}
