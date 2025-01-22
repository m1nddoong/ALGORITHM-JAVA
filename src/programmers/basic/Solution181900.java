package programmers.basic;

// 글자 지우기 : https://school.programmers.co.kr/learn/courses/30/lessons/181900
public class Solution181900 {
    public static String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();

        char[] arr = my_string.toCharArray();
        for (int i : indices) {
            arr[i] = '@';
        }
        for (char c : arr) {
            if (c != '@') {
                answer.append(c);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(my_string, indices));
    }
}
