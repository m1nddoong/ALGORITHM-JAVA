package programmers.알고리즘_고득점_Kit.N01_해시;

import java.util.HashMap;
import java.util.Map;

// 완주하지 못한 선수 : https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Solution42576 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            if (!map.containsKey(p)) {
                map.put(p, 1);
            } else {
                int value = map.get(p);
                map.put(p, ++value);
            }
        }

        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println(solution(participant1, completion1));

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant2, completion2));

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant3, completion3));
    }
}
