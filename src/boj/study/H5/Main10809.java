package boj.study.H5;

// 알파벳 찾기 : https://www.acmicpc.net/problem/10809

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // a부터 z까지의 배열 -1로 초기화
        int[] alphabet = new int[26];

        // 문자열을 char 배열로 변환
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 97; // 어떤 알파벳인지 알아냄
            if (alphabet[index] == 0)
                alphabet[index] = i+1; // 처음 등장한 위치 값 업데이트 (1씩 추가해줘서 업데이투함 -> 나중에 출력할떄 1씩 뺼거임)
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]-1 + " ");
        }
    }
}
