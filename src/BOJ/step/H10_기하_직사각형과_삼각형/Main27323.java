package BOJ.step.H10_기하_직사각형과_삼각형;

// 직사각형 : https://www.acmicpc.net/problem/27323

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27323 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        System.out.println(A*B);
    }
}
