package BOJ.step.H12_브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        // a, b, c, d, e, f 입력
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        int c = Integer.parseInt(input.split(" ")[2]);
        int d = Integer.parseInt(input.split(" ")[3]);
        int e = Integer.parseInt(input.split(" ")[4]);
        int f = Integer.parseInt(input.split(" ")[5]);

        // x, y 쌍에 대해서 방정식을 만족하는지
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((a * x + b * y == c) && (d * x + e * y == f)) {
                    System.out.println(x + " " + y);
                }
            }
        }
    }
}
