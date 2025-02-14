package BOJ.classification.N00_수학;

import java.io.*;

// 더하기 사이클 : https://www.acmicpc.net/problem/1110
class Main1110 {
    public static int length = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int first = n / 10;
        int second = n % 10;

        int newN;
        while (true) {
            newN = second * 10 + (first + second) % 10;
            length++;
            first = newN / 10;
            second = newN % 10;
            if (newN == n) break;
        }
        System.out.println(length);
    }
}