package d3;


import java.util.Stack;

// 괄호 테스트
public class ParTest {
    public static boolean test(String target) {
        // 문자열에서 문자를 뽑아내는 것을 자바에서 더 선호하기 때문에 Stack 의 자료형은 Character 로 할 것.
        Stack<Character> charStack = new Stack<>();

        // 1. target의 각 글자를 확인한다.
        for (int i = 0; i < target.length(); i++) {
            char next = target.charAt(i);  // i번째 문자 가져오기
            if (next == '(') { // 2. 여는 괄호를 만나면 push 한다.
                charStack.push(next);
            }
            else { // 3. 닫는 괄호를 만나면, 상황에 따라 pop 을 하는데
                if (charStack.empty()) { // 3-1. stack이 비어있다 == 정당한 괄호가 아니다.
                    // 결과는 false 다
                    return false;

                }
                else charStack.pop(); // 3-2. stack이 비어있지 않으면 pop
            }
        }
        // 4. 문자열 내부 글자를 다 확인했으면 -> 스택이 비어있는지 확인하면 그게 답이다.
        return charStack.empty();
    }


    public static void main(String[] args) {
        // target 이 맞는 괄호 조합인지 확인하고 싶다.
        String target = "()()(((())))()";
        System.out.println(test(target));
        target = "()()(((())))(())(";
        System.out.println(test(target));
    }
}
