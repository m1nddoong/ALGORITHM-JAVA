package boj.step.H6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 공부 : https://www.acmicpc.net/problem/1157
public class Main1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] chars = input.toCharArray();

        // a부터 z까지의 배열이 있다.
        int[] alphabets = new int[26];
        int index = 0;

        // 대소관계 구별없이, 해당하는 알파벳에 카운트하자.
        for (int i = 0; i < chars.length; i++) {
            // 대문자라면
            if (65 <= chars[i] && chars[i] <= 90) {
                // 소문자로 바꿔주고, 인덱스로 만들어준다 (소문자 a가 0번 인덱스)
                index = chars[i] + 32 - 97;
                alphabets[index]++;
            }
            // 그냥 소문자라면
            else {
                index = chars[i] - 97;
                alphabets[index]++;
            }
        }

        int max = alphabets[0];
        int maxIndex = 0;
        // 알파벳을 각각 카운팅 한 결과 확인
        for (int i = 0; i < alphabets.length; i++) {
            // 가장 많이 카운팅 된 알파벳 :
            if (max <= alphabets[i]) {
                max = alphabets[i];
                maxIndex = i;
            }
        }

        int maxCount = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (max == alphabets[i]) {
                maxCount++;
            }
        }
        // 출력
        if (maxCount >= 2) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxIndex + 97 - 32));
        }

    }
}
