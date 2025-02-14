package BOJ.step.H06_심화1;

// 크로아티아 알파벳 : https://www.acmicpc.net/problem/2941

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 크로아티아 알파벳 정의
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int count = 0;
        int index = 0;

        // 크로아티아 알파벳을 확인하고 개수 세기
        while (index < input.length()) {
            boolean found = false;
            for (String croatian : croatianAlphabet) {
                if (input.startsWith(croatian, index)) {
                    count++;
                    index += croatian.length(); // 해당 크로아티아 알파벳 길이만큼 인덱스 증가
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
                index++;
            }
        }

        System.out.println(count);
    }
}
