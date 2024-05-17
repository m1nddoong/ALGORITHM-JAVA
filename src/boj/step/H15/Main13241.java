package boj.step.H15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        String input = reader.readLine();
        String strA = input.split(" ")[0];
        String strB = input.split(" ")[1];

        // 50% 확률로 입력 A, B 가 1000 이상일 떄
        if (1000 <= Integer.parseInt(strA) && 1000 <= Integer.parseInt(strB)) {
            long longA = Integer.parseInt(strA);
            long longB = Integer.parseInt(strB);
            // 공배수 구하기
            long longMin = Math.min(longA, longB);
            long longMax = Math.max(longA, longB);
            for (int i = 1; i < longMax+1; i++) {
                if ((longMin * i) % longMax == 0) {
                    builder.append((longMin * i));
                    break;
                }
            }

        }
        else {
            int intA = Integer.parseInt(strA);
            int intB = Integer.parseInt(strB);
            //공배수 구하기
            int intMin = Math.min(intA, intB);
            int intMax = Math.max(intA, intB);
            for (int i = 1; i < intMax+1; i++) {
                if ((intMin * i) % intMax == 0) {
                    builder.append((intMin * i));
                    break;
                }
            }
        }
        System.out.println(builder);
    }
}
