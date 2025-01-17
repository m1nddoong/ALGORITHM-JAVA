package programmers.basic;

// 문자열 여러 번 뒤집기 : https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class Solution181913 {
    public static String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        char tmp;
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j < queries[i][0] + (queries[i][1] - queries[i][0] + 1) / 2; j++) {
                tmp = arr[j];
                arr[j] = arr[queries[i][0] + queries[i][1] - j];
                arr[queries[i][0] + queries[i][1] - j] = tmp;
            }
        }
        for (char c : arr) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(my_string, queries));
    }
}
