package programmers.level1;

// 문자열 내 p와 y의 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class Solution12916 {
    public static boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') cntP++;
            else if (c == 'y') cntY++;
        }
        return cntP == cntY ? true : false;
    }

    public static void main(String[] args) {
        String s1 = "pPoooyY";
        String s2 = "Pyy";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
