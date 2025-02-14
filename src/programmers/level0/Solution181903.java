package programmers.level0;


public class Solution181903 {
    public static String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer = answer + code.charAt(i);
            }
        }
        // 문자열을 동적으로 만들고 싶을 때 사용하는 클래스
        StringBuilder answerBuilder = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answerBuilder.append(code.charAt(i));
            }
        }
        return answerBuilder.toString();

//        // code 를 문자 배열러 민들기
//        char[] arr = code.toCharArray();
//
//        StringBuilder stringBuilder = new StringBuilder();
//        String answer = "";
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i % q == r) {
//                stringBuilder.append(arr[i]);
//            }
//        }
//        // String 에 StrinBuilder 를 그대로 넣을 수 없기 떄문에 toString()
//        answer = stringBuilder.toString();
//        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 1 ,"qjnwezgrpirldywt"));
    }
}
