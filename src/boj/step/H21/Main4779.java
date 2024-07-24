package boj.step.H21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4779 {
    public static boolean[] arr;
    public static int space;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            int n = Integer.parseInt(s);
            // 총 문자열의 공간
            space = (int) Math.pow(3, n);

            arr = new boolean[space];
            division(n, 0);

            for (int i = 0; i < space; i++) {
                sb.append(arr[i] ? " " : "-");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void division(int n, int first) {
        while (n > 0) {
            // 3등분 하였을 때 한 선의 길이
            int length = (int) Math.pow(3, (n - 1));
            for (int i = first + length; i < first + 2 * length; i++) {
                // 공백을 true 로 설정
                arr[i] = true;
            }
            n--;
            for (int i = 0; i < space; i += first + 2 * length) {
                division(n, i);
            }
        }
    }
}

