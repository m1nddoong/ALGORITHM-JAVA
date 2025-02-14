package programmers.level0;

// 조건 문자
// 새싹, 조건 문자열, 고무오리
public class Solution181934 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">") && eq.equals("=")) {
            if(n >= m) answer = 1;
            else answer = 0;
        }
        else if (ineq.equals("<") && eq.equals("=")) {
            if(n <= m) answer = 1;
            else answer = 0;
        }
        else if (ineq.equals(">") && eq.equals("!")) {
            if(n > m) answer = 1;
            else answer = 0;
        }
        else if (ineq.equals("<") && eq.equals("!")) {
            if(n < m) answer = 1;
            else answer = 0;
        }

        return answer;
    }
}
