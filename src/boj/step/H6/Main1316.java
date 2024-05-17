package boj.step.H6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어 체커 : https://www.acmicpc.net/problem/1316
public class Main1316 {
    static int count = 0; // 그룸 단어의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // n개의 단어를 입력
            String str = br.readLine();
            // str 이 그룹단어인지 아닌지 체크
            if (GroupWordsCheck(str)) count++;
        }
        System.out.println(count);
    }

    public static boolean GroupWordsCheck(String str) {
        // 일단 문자열을 문자배열로 쪼갠다.
        char[] words = str.toCharArray();
        // 만약 문자열이 단순 한 단어 라면 '그룹단어' 이다.
        if (words.length == 1) {
            return true;
        }
        // '연속단어' 인지 판단하는 Boolean 배열
        boolean[] continuousWords = new boolean[26];
        // a ~ z 까지의 문자를 0 ~ 25의 정수로 매핑
        int temp = words[0] - 97;
        for (int i = 1; i < words.length; i++) {
            if (temp != words[i] - 97) { // temp와 현재단어의 값이 다르면
                continuousWords[temp] = true; // temp를 `연속단어`라 하고
                temp = words[i] - 97; // temp를 현재단어로 교체
                // 근데 만약 temp가 이미 연속단어라면
                // 그룹단어로 인정받을 수 없기 떄문에 false 반환
                if (continuousWords[temp]) return false;
            }
        }
        return true;
    }
}
