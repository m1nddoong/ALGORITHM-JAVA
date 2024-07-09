package boj.step.H16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put(')', '(');
        bracket.put(']', '[');

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break; // 종료조건
            }

            sb.append(solve(s, bracket)).append('\n');
        }
        System.out.println(sb);

    }

    public static String solve(String s, Map<Character, Character> bracket) {
        Stack<Character> stackChar = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 여는 기호의 경우, 스택에 추가
            if (c == '(' || c == '[') {
                stackChar.push(c);
            }
            else if (c == ')' || c == ']') {
                // 스택이 비어있거나 pop할 원소가 소괄호 및 대괄호랑 매칭이 안되는 경우
                if (stackChar.isEmpty() || stackChar.peek() != bracket.get(c)) {
                    return "no";
                }
                else {
                    stackChar.pop();
                }
            }
            // 그 외 skip
        }

        if (stackChar.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }

    }
}

