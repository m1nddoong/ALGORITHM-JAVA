package programmers.level0;

public class Solution181933 {
    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? a + b : a- b;
        return answer;
    }

    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;
        System.out.println(solution(a, b, flag));
    }

}
