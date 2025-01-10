package programmers.basic;

/**
 * 문자열 겹쳐쓰기 : https://school.programmers.co.kr/learn/courses/30/lessons/181943#
 */
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        /*
        // 내코드
        char[] myArr = my_string.toCharArray();
        char[] overwriteArr = overwrite_string.toCharArray();

        for (int i = 0; i < overwriteArr.length; i++) {
            myArr[i+s] = overwriteArr[i];
        }

        return String.valueOf(myArr);
         */

        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}

public class Solution181943 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("He11oWorld", "lloWorl", 2));
    }
}


