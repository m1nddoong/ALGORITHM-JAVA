package programmers.basic;

import java.util.*;

// 할 일 목록 : https://school.programmers.co.kr/learn/courses/30/lessons/181885
public class Solution181885 {
    public static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer.add(todo_list[i]);
            }
        }
        return answer.toArray(String[]::new);

        // * Stream 풀이법 *
        // return IntStream.range(0, finished.length)
        //          .filter(i -> !finished[i])
        //          .mapToObj(i -> todo_list[i])
        //          .toArray(String[]::new)
    }

    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }
}
