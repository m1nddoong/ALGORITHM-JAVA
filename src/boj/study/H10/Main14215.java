package boj.study.H10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 세 막대 : https://www.acmicpc.net/problem/14215
public class Main14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int [] s = {a, b, c};
        Arrays.sort(s);
        if (s[0]+s[1] > s[2]) System.out.println(a+b+c);
        else System.out.println(2 * (s[0] + s[1]) - 1);

        br.close();
    }
}
