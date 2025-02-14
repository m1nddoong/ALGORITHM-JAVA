package programmers.level0;

// 수 조작하기 1 : https://school.programmers.co.kr/learn/courses/30/lessons/181926
public class Solution181926 {
    public static int solution(int n, String control) {
//        for (int i = 0; i < control.length(); i++) {
//            char c = control.charAt(i);
//            if (c == 'w') n++;
//            else if (c == 's') n--;
//            else if (c == 'd') n += 10;
//            else n -= 10;
//        }
//        return n;

        int answer = 0;
        for (char c : control.toCharArray()) {
            switch(c) {
                case 'w' : answer += 1; break;
                case 's' : answer -= 1; break;
                case 'd' : answer += 10; break;
                case 'a' : answer -= 10; break;
                default: break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        System.out.println(solution(n, control));
    }
}
