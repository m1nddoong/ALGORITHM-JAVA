package programmers.basic;

// 0 떼기 : https://school.programmers.co.kr/learn/courses/30/lessons/181847
public class Solution181847 {
    public static String solution(String n_str) {
//        String answer = "";
//        char[] charArray = n_str.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] != '0') {
//                answer = n_str.substring(i, n_str.length());
//                break;
//            }
//        }
//
//        return answer;
        return String.valueOf(Integer.parseInt(n_str));
    }
    public static void main(String[] args) {
        String n_str1 = "0010";
        String n_str2 = "854020";
        System.out.println(solution(n_str1));
        System.out.println(solution(n_str2));
    }
}

