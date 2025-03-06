package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 제일 작은 수 제거하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class Solution12935 {
    public static int[] solution(int[] arr) {
        int[] originalArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        List<Integer> nums = new ArrayList<>();
        for (int num : originalArr) {
            if (num != arr[0]) {
                nums.add(num);
            }
        }

        return nums.isEmpty()
                ? new int[]{-1} : nums.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        // int[] arr1 = {4, 3, 2, 1};
        // int[] arr2 = {10};
        int[] arr3 = {2, 4, 1, 3};
        // System.out.println(Arrays.toString(solution(arr1)));
        // System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));

    }
}
