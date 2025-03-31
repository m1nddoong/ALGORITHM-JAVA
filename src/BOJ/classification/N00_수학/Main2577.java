package BOJ.classification.N00_수학;

import java.util.*;
import java.io.*;

// 숫자의 개수 : https://www.acmicpc.net/problem/2577
public class Main2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result = A * B * C;

        int[] numbers = new int[10];
        String number = String.valueOf(result);

        for (int i = 0; i < number.length(); i++) {
            numbers[Integer.parseInt(String.valueOf(number.charAt(i)))]++;
        }

        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]).append("\n");
        }

        System.out.println(sb.toString());

    }
}
