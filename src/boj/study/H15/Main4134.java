package boj.study.H15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int T = Integer.parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            BigInteger n = BigInteger.valueOf(Long.parseLong(reader.readLine()));
            if (n.isProbablePrime(10)) {
                builder.append(n).append("\n");
            } else {
                builder.append(n.nextProbablePrime()).append("\n");
            }
        }
        System.out.println(builder);
    }
}