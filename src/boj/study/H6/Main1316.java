package boj.study.H6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어 체커 : https://www.acmicpc.net/problem/1316
public class Main1316 {
    // 그룸 단어의 개수
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // n개의 단어를 입력받자.
            String str = br.readLine();

            // str 이 그룹단어인지 아닌지 체크
            if (GroupWordsCheck(str)) count++;
        }
        System.out.println(count);
    }

    // 입력받은 문자열이 그룹 단어인지 체크
    public static boolean GroupWordsCheck(String str) {
        // 일단 문자열을 문자로 쪼갠다.
        char[] words = str.toCharArray();
        if (words.length == 1) {
            return true;
        }
        // 그룹단어로 판정받았는지 확인하는 불린 배열
        boolean[] continuousWords = new boolean[26];
        int temp = words[0] - 97; // words[0] 가 a라면 97이라는 정수를 가질 것
        for (int i = 1; i < words.length; i++) {
            if (temp != words[i] - 97) { // 이전 단어랑 다르면
                continuousWords[temp] = true; // 연속단어라 부른다.
                temp = words[i] - 97; // temp 를 a에서 b로 바꾼다
                // 근데 만약 현재 단어가 이미 그룹단어가 아니라면
                if (continuousWords[temp]) return false;
            }
        }
        return true;
    }
}
