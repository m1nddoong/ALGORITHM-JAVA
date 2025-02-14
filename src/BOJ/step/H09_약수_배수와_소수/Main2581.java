package BOJ.step.H09_약수_배수와_소수;

// 소수 : https://www.acmicpc.net/problem/2581

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int total = 0;
        int min = 10000;

        // M이상 N이하 자연수 i
        for (int i = M; i <= N; i++) {
            for (int j = 1; j <= 10000; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) {
                total += i;
                if (min > i) min = i;
            }
            count = 0;
        }
        if (total == 0) {
            System.out.println("-1");
        } else {
            System.out.println(total);
            System.out.println(min);
        }
    }
}
