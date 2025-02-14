package programmers.level0;

// 문자열이 몇 번 등장하는지 세기 : https://school.programmers.co.kr/learn/courses/30/lessons/181871
public class Solution181871 {
    public static int solution(String myString, String pat) {
        int answer = 0;
        int idx = -1;

        while (true) {
            idx = myString.indexOf(pat, idx + 1);
            if (idx == -1) break;
            answer++;
        }

        return answer;

        // 최적화 버전 (for 문 사용)
        // for (int idx = 0; (idx = myString.indexOf(pat, idx)) != -1; idx++) {
        //     answer++;
        // }
        // return answer;
    }

    public static void main(String[] args) {
        String myString1 = "banana";
        String pat1 = "ana";
        System.out.println(solution(myString1, pat1));
        String myString2 = "aaaa";
        String pat2 = "aa";
        System.out.println(solution(myString2, pat2));
    }
}
