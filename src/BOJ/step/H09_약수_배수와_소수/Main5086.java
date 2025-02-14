package BOJ.step.H09_약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String input = "";

        while (true) {
            // 입력 받기
            input = reader.readLine();
            int A = Integer.parseInt(input.split(" ")[0]);
            int B = Integer.parseInt(input.split(" ")[1]);

            // 입력이 0 0 이면 반복 종료
            if (A == 0 && B == 0) break;

            // A 가 B 의 약수라면 factor 를 출력
            if (B % A == 0) {
                stringBuilder.append("factor\n");
            }
            // A 가 B의 배수라면 multiple 출력
            else if (A % B == 0) {
                stringBuilder.append("multiple\n");
            }
            // 둘다 아니라면 neither 출력
            else {
                stringBuilder.append("neither\n");
            }
        }
        System.out.println(stringBuilder);
    }
}

// 문제점
// 3가지 if-else 케이스마다의 출력값을 조건문 내에서 출력하는 것이 아닌
// 출력문을 stringBuilder 에 담아서 0 0일 경우 한번에 출력하는 형태로 작성했어야 했다.
// 조건문 분기마다 System.out.println() 을 하면 안되니 조심하자



