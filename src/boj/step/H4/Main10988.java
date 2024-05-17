package boj.step.H4;

import static java.lang.Character.isLowerCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] inputChar = input.toCharArray();

        // 소문자로만 이루어져있는지 체크
        boolean isLowerAlphabet = true;
        for (Character c : inputChar) {
            if (!isLowerCase(c)) {
                isLowerAlphabet = false;
            }
        }

        int length = inputChar.length;
        boolean isPalindrome = true;

        // 소문자로 이루어져 있고, 단어의 길이가 1 이상 100 이하일떄
        while (isLowerAlphabet && 1 <= length && length <= 100) {
            for (int i = 0; i < length; i++) {
                // 팰린드롬 조건을 만족하지 않으면
                if (!(inputChar[i] == inputChar[length - i - 1])) {
                    isPalindrome = false;
                }
            }
            if (isPalindrome) {
                System.out.println(1);
                break;
            } else {
                System.out.println(0);
                break;
            }
        }
    }
}
