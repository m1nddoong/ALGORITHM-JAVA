package d1;

public class Solution {

    public static String solution(String str1, String str2) {
        // StringBuilder 로 답을 작성하기
        // 백준 문제풀때 많이 사용하니 익숙해지는것 추천

        // 1. 우선 StringBuilder 클래스 객체를 생성한다 - 문자열을 만드는 객체
        StringBuilder lineBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            // 정답 문자열에 뒤에 붙이고 싶은 데이터를
            // lineBuilder에 append 메서드로 전달.
            lineBuilder.append(str1.charAt(i));
            lineBuilder.append(i);
            lineBuilder.append(str2.charAt(i));
        }
        String answer = lineBuilder.toString();

        // 4. 답을 반환한다.
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("aaaaa", "bbbbb"));
    }
}