package BOJ.step.H13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main1472 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String input = reader.readLine();
        int N = Integer.parseInt(input);

        // 1. 입력된 수를 자리수별로 쪼개기
        // 10 의 (4-1) 재곱부터 1씩 줄어들면서 나머지 저장.
        // 2143 길이 4
        int[] digits = new int[10];
        digits[0] = (int) (N / Math.pow(10, input.length() -1));
        int remainder = (int) (N % Math.pow(10, input.length() - 1));
        for (int i = 1; i < input.length(); i++) { // 1 2 3
            if (i == input.length() - 1) {
                digits[i] = remainder % 10;
                break;
            }
            // 나머지 업데이트
            digits[i] = (int) (remainder / Math.pow(10, input.length() - i - 1));
            remainder = (int) (remainder % Math.pow(10, input.length() - i - 1));
        }

        // 2. 정렬하기
        Arrays.sort(digits);
        for (int i = 9; i >= 10 - input.length(); i--) {
            builder.append(digits[i]);
        }
        System.out.println(builder);
    }
}
