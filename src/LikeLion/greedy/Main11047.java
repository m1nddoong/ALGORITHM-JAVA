package LikeLion.greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 동전 0 : https://www.acmicpc.net/problem/11047
public class Main11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        int[] coin = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = N-1; i >= 0; i--) { // K = 4200
            while(K >= coin[i]) {
                K -= coin[i];
                count++;
            }
            if (K == 0) break;
        }


        System.out.println(count);
    }

}
