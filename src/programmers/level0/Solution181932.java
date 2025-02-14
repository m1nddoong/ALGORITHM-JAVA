package programmers.level0;



public class Solution181932 {
    public static String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

//        for (int i = 0; i < code.length(); i++) {
//            char c = code.charAt(i);
//            if (mode == 0) {
//                if (c == '1') {
//                    mode = 1;
//                } else if (i % 2 == 0) {
//                    answer.append(c);
//                }
//            } else {
//                if (c == '1') {
//                    mode = 0;
//                } else if (i % 2 == 1) {
//                    answer.append(c);
//                }
//            }
//        }
//        if (answer.isEmpty()) {
//            return "EMPTY";
//        } else {
//            return answer.toString();
//        }

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
            }
            if (i % 2 == mode) {
                answer.append(c);
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer.toString();

    }

    public static void main(String[] args) {
        String code = "abc1abc1abc";
        System.out.println(solution(code));
    }
}
