package programmers.basic;

/**
 * 문자열 겹쳐쓰기 : https://school.programmers.co.kr/learn/courses/30/lessons/181943#
 */
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] myArr = my_string.toCharArray();
        char[] overwriteArr = overwrite_string.toCharArray();

        for (int i = 0; i < overwriteArr.length; i++) {
            myArr[i+s] = overwriteArr[i];
        }

        return String.valueOf(myArr);
    }
}

public class Solution181943 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("He11oWorld", "lloWorl", 2));
    }
}
