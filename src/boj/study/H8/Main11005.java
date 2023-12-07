package boj.study.H8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[1]);

        StringBuilder result = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder >= 10) {
                result.insert(0, (char) ('A' + remainder - 10));
            } else {
                result.insert(0, remainder);
            }
            N /= B;
        }

        System.out.println(result);
    }
}