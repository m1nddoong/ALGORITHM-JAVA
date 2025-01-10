package programmers.lecture.d4lecture;

class Solution {
    public String solution(String code) {
        StringBuilder answerBuilder = new StringBuilder();
        // 181932 코드 처리하기

        // 기본 mode 설정
        int mode = 0;
        // code 를 앞에서부터 읽자
        for (int i = 0; i < code.length(); i++) {
            // 현재 문자를 가져오고,
            char letter = code.charAt(i);
            // 현재 문자가 1이면: mode 변경
            if (letter == '1') { // 문자 1
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            }
            // 현재 문자가 1이 아니면
            else {
                // mode가 1이고, i가 홀수이면 answerBuilder에 추가
                if (mode == 1 && i % 2 == 1)
                    answerBuilder.append(letter);
                // mode가 0이고, i가 짝수이면 answerBuilder에 추가
                if (mode == 0 & i % 2 == 0) {
                    answerBuilder.append(letter);
                }
            }

            if (letter == '1') {
                mode = '1' - mode + '0';
            } else {
                // mode가 1이고, i가 홀수이면 answerBuilder에 추가
                if (mode == 1 && i % 2 == 1)
                    answerBuilder.append(letter);
                // mode가 0이고, i가 짝수이면 answerBuilder에 추가
                if (mode == 0 & i % 2 == 0) {
                    answerBuilder.append(letter);
                }
            }
        }

        // 결과 수홥
        String answer = answerBuilder.toString();
        return answer.isEmpty() ? "EMPTY" : answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution("abc1abc1abc"));
    }
}