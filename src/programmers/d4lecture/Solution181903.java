package programmers.d4lecture;


public class Solution181903 {
    public static String solution(int q, int r, String code) {
        // code 를 문자 배열러 민들기
        char[] arr = code.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            if (i % q == r) {
                stringBuilder.append(arr[i]);
            }
        }
        // String 에 StrinBuilder 를 그대로 넣을 수 없기 떄문에 toString()
        answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 1 ,"qjnwezgrpirldywt"));
    }
}
