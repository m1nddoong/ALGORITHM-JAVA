package boj.step.H21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4779 {
    public static String[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s != null && !s.isEmpty()) {
                if(s.equals("0")) {
                    sb.append("-").append("\n");
                    continue;
                }

                // 총 문자열의 공간
                int n = Integer.parseInt(s);
                int length = (int) Math.pow(3, n);

                arr = new String[length];
                for (int i = 0; i < length; i++) {
                    arr[i] = "-";
                }

                division(length, 0);

                for (int i = 0; i < length; i++) {
                    sb.append(arr[i]);
                }
                sb.append("\n");

            } else {
                break;
            }
        }
        System.out.print(sb);
    }

    public static void division(int length, int start) {
        if (length <= 1) {
            return;
        }
        // 3등분 하였을 때 한 선의 길이
        int newLength = length / 3;
        for (int i = start + newLength; i < start + 2 * newLength; i++) {
            // 공백을 true 로 설정
            arr[i] = " ";
        }
        division(newLength, start);
        division(newLength, start + newLength * 2);
    }
}
