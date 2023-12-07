package boj.study.H8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        String N = input.split(" ")[0];
        int B = Integer.parseInt(input.split(" ")[1]);
        int sum = 0;
        if (2 <= B && B <= 36) {
            for (int i = 0; i < N.length(); i++) {
                if ('A' <= N.charAt(i) && N.charAt(i) <= 'Z') {
                    sum += (int) ((10 + N.charAt(i) - 'A') * Math.pow(B, N.length() - i-1));
                } else {
                    sum += (int) (Integer.parseInt(String.valueOf(N.charAt(i))) * Math.pow(B, N.length() - i -1));
                }
                System.out.println((int) N.charAt(i));
                System.out.println(Integer.parseInt(String.valueOf(N.charAt(i))));
            }
            System.out.println(sum);
        }
    }
}


