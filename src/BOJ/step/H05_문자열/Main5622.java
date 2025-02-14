package BOJ.step.H05_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다이얼 : https://www.acmicpc.net/problem/5622
public class Main5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] alphabets = input.toCharArray();

        int sum = 0;

        for (char c : alphabets) {
            sum += duration(c);
        }
        System.out.println(sum);
    }

    public static int duration(char c) {
        if (c == 'A' || c == 'B' || c == 'C') {
            return 3;
        }
        else if (c == 'D' || c == 'E' || c == 'F') {
            return 4;
        }
        else if (c == 'G' || c == 'H' || c == 'I') {
            return 5;
        }
        else if (c == 'J' || c == 'K' || c == 'L') {
            return 6;
        }
        else if (c == 'M' || c == 'N' || c == 'O') {
            return 7;
        }
        else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
            return 8;
        }
        else if (c == 'T' || c == 'U' || c == 'V') {
            return 9;
        }
        else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
            return 10;
        }
        return 0;
    }
}
