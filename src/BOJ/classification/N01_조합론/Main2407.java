package BOJ.classification.N01_조합론;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

// [실버 3] 조합 : https://www.acmicpc.net/problem/2407
public class Main2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);

        BigInteger nFac = factorial(n);
        BigInteger rFac = factorial(m);
        BigInteger n_rFac = factorial(n - m);

        // nCr = n! / (r! * (n - r)!)
        BigInteger result = nFac.divide(rFac.multiply(n_rFac));

        // 출력
        System.out.println(result);

    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
