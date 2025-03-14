package programmers.level1;

import java.util.*;

// 두 개 뽑아서 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class Solution68644 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        for (Integer num : set) {
            list.add(num);
        }

        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] numbers1 = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(new Solution68644().solution(numbers1)));
        int[] numbers2 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(new Solution68644().solution(numbers2)));
    }
}

