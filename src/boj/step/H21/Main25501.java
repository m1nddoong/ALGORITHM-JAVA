package boj.step.H21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25501 {
    private static int count;

    public static int recursion(String s, int l, int r) {
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            count++;
            return recursion(s, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String s) {
        count = 1;
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String input;
        for (int i = 0; i < t; i++) {
            input = br.readLine();
            int result = isPalindrome(input);
            sb.append(result).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}
