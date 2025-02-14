package programmers.level0;

// 원하는 문자열 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class Solution181878 {
    public static int solution(String myString, String pat) {
//        StringBuilder myStringBuilder = new StringBuilder();
//        StringBuilder patBuilder = new StringBuilder();
//        for (char c : myString.toCharArray()) {
//            if ((int) c >= 97) {
//                myStringBuilder.append((char) (c - 32));
//            } else {
//                myStringBuilder.append(c);
//            }
//        }
//        for (char c : pat.toCharArray()) {
//            if ((int) c >= 97) {
//                patBuilder.append((char) (c - 32));
//            } else {
//                patBuilder.append(c);
//            }
//        }
//        myString = myStringBuilder.toString();
//        pat = patBuilder.toString();
//
//        return myString.contains(pat) ? 1 : 0;

        int answer = 0;

        String str1 = myString.toLowerCase();
        String str2 = pat.toLowerCase();

        if (str1.contains(str2)) {
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        String myString1 = "AbCdEfG";
        String pat1 = "aBc";
        System.out.println(solution(myString1, pat1));
        String myString2 = "aaAA";
        String pat2 = "aaaaa";
        System.out.println(solution(myString2, pat2));
    }
}
