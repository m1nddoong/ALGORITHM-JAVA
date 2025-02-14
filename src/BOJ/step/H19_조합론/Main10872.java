package BOJ.step.H19_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int sum = 1;
        for (int i = 1; i < N+1; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
