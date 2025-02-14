package BOJ.step.H09_약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int factorSum = 0;
        StringBuilder sb = new StringBuilder();
        List<Integer> inputList = new ArrayList<>(); // 입력된 수를 저장할 list

        // 맵은 순서를 보장하지 않으므로 패스
        while (true) {
            // 여러 줄 입력받고
            input = reader.readLine();
            int n = Integer.parseInt(input);
            if (n == -1) break; // -1 입력 시 종료
            inputList.add(n); // 입력빋은 값 저장
        }

        // 입력된 수의 개수만큼 반복
        for (int i = 0; i < inputList.size() ; i++) {
            List<Integer> factorList = new ArrayList<>();
            // 1 ~ {입력된 수+1} 까지를
            for (int j = 1; j < inputList.get(i) + 1; j++) {
                if (inputList.get(i) % j == 0 && inputList.get(i) != j) {  // 각각 나눴을때 나머지가 0이면 약수로 판단
                    factorList.add(j);
                    factorSum += j; // 약수들의 합 구하기
                }
            }

            // 완전수라면
            if (factorSum == inputList.get(i)) {
                sb.append(String.format("%d = ", inputList.get(i)));
                for (int j = 0; j < factorList.size(); j++) {
                    if (j == factorList.size() - 1) {
                        sb.append(String.format("%d\n", factorList.get(j)));
                        break;
                    }
                    sb.append(String.format("%d + ", factorList.get(j)));
                }
            }
            // 완전수가 아니다
            else {
                sb.append(String.format("%d is NOT perfect.\n", inputList.get(i)));
            }
            // 0으로 초기화
            factorSum = 0;
        }

        System.out.println(sb);
    }
}
