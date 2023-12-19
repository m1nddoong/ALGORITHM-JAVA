package boj.study.H12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 블랙잭 : https://www.acmicpc.net/problem/2798
public class Main2798 {
    public static int combCard(int N, int M, List<Integer> list) { // n개 중에 3개를 뽑기
        // 얼마나 가까운지
        int minSum = Math.abs(M - (list.get(0)+list.get(1)+ list.get(2)));
        int newI = 0;
        int newJ = 1;
        int newK = 2;

        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j <N-1 ; j++) {
                for (int k = j+1; k < N; k++) {
                    if (list.get(i) + list.get(j) + list.get(k) <= M) {
                        if (minSum >= M - (list.get(i) + list.get(j) + list.get(k))) {
                            minSum = M - (list.get(i) + list.get(j) + list.get(k));
                            newI = i;
                            newJ = j;
                            newK = k;
                        }
                    }
                }
            }
        }
        return list.get(newI) + list.get(newJ) + list.get(newK);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        List<Integer> list = new ArrayList<>();

        String cardInput = reader.readLine();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(cardInput.split(" ")[i]));
        }
        System.out.println(combCard(N, M, list));
    }
}


