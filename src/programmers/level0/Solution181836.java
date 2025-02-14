package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 그림 확대 : https://school.programmers.co.kr/learn/courses/30/lessons/181836
public class Solution181836 {
    public static String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb;
        for (String s : picture) {
            sb = new StringBuilder();
            String[] pieces = s.split("");
            for (String piece : pieces) {
                sb.append(String.valueOf(piece).repeat(k));
            }
            for (int n = 0; n < k; n++) {
                answer.add(sb.toString());
            }
        }
        return answer.toArray(String[]::new);
    }
    public static void main(String[] args) {
        String[] picture1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k1 = 2;
        System.out.println(Arrays.toString(solution(picture1, k1)));
        String[] picture2 = {"x.x", ".x.", "x.x"};
        int k2 = 3;
        System.out.println(Arrays.toString(solution(picture2, k2)));
    }
}

