package boj.step.H19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        System.out.println(N*(N-1));
    }
}
