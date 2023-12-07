package boj.lecture;

// 12/6 스택
// 괄호
// https://www.acmicpc.net/problem/9012

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main9012 {
    // 괄호를 검사하는 메서드를 만들자
    public static boolean isVPS(String line) {
        // 각 글자 중 열린 괄호를 담은 스택을 만든다.
        Stack<Character> charStack = new Stack<>();

        // 입력받은 문자열의 각 글자를 순회한다.
        for (int i = 0; i < line.length(); i++) {
            char next = line.charAt(i);
            // 만약 글자가 열린 괄호('(') 라면 스택에 push.
            if (next == '(') {
                charStack.push(next);
            }
            // 아니라면 닫힌 괄호(')') 이다.
            else {
                // 스택이 비었다면 return false.
                if (charStack.empty()) {
                    return false;
                }
                // 비어있지 않다면 pop
                else charStack.pop();
            }
        }
        // 순회 종료
        // 스택이 비어있는지를 확인하고 반환한다.
        return charStack.empty();
    }

    public static void main(String[] args) throws IOException {
        // false
        // System.out.println(isVPS("(())())"));
        // false
        // System.out.println(isVPS("(((()())()"));
        // true
        // System.out.println(isVPS("(()())((()))"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 case 개수 입력 받기
        int tests = Integer.parseInt(reader.readLine());

        // StringBuilder 방법? 있을까 나중에 레퍼런스 참고

        // 테스트 case 개수만큼 반복
        for (int i = 0; i < tests; i++) {
            // 다음 입력받은 줄을 테스트 한 결과가 참이면
            if (isVPS(reader.readLine())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
