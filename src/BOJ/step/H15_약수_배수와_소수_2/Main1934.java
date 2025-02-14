package BOJ.step.H15_약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int T = Integer.parseInt(reader.readLine());
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            String input = reader.readLine();
            int A = Integer.parseInt(input.split(" ")[0]);
            int B = Integer.parseInt(input.split(" ")[1]);
            // 내가 생각한 풀이법
            // 1. A와 B중 작은 것을 곱셈의 피연산자로 이용
            int min = Math.min(A, B);
            int max = Math.max(A, B);
            // 2. A가 작다고 했을떄, B의 약수들을 구해서
            for (int j = 1; j < max+1; j++) {
                // 3. A를 B의 약수들과 곱해가면서 A*B 가 B의 배수인 숫자를 발견한 즉시 buidler 에 넣고 break;
                if (max % j == 0 && (j * min) % max == 0) {
                    builder.append((j * min)).append("\n");
                    break;
                }
            }
        }
        System.out.println(builder);
    }
}
