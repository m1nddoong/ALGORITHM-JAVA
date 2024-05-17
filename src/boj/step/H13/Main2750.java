package boj.step.H13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        // 수의 개수
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        // ArrayList 를 오름차순으로 정렬
        Collections.sort(list);
        for (int num : list) {
            System.out.println(num);
        }
    }
}
