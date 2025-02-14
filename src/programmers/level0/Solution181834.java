package programmers.level0;

// l로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/181834
public class Solution181834 {
    public static String solution(String myString) {
//        StringBuilder answer = new StringBuilder();
//
//        for (char c : myString.toCharArray()) {
//            if (c < 'l') {
//                answer.append('l');
//            } else {
//                answer.append(c);
//            }
//        }
//
//        return answer.toString();
        return myString.replaceAll("^[l-z]", "l");
    }
    public static void main(String[] args) {
        String myString1 = "abcdevwxyz";
        System.out.println(solution(myString1));
        String myString2 = "jjnnllkkmm";
        System.out.println(solution(myString2));
    }
}
