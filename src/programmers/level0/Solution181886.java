package programmers.level0;

import java.util.*;

// 5명씩 : https://school.programmers.co.kr/learn/courses/30/lessons/181886
public class Solution181886 {
    public static String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }

        return answer.toArray(String[]::new);
        // 최적화를 통해 new String[0]을 전달하면 내부적으로 빈 배열을 생성하지 않고,
        // 리스트 크기에 맞는 배열을 바로 할당
        // return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(solution(names)));
    }
}
