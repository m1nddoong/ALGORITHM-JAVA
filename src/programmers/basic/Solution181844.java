package programmers.basic;

import java.util.*;

// 배열의 원소 삭제하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181844
public class Solution181844 {
    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        boolean isDelete = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    isDelete = true;
                    break;
                }
            }
            if (!isDelete) {
                answer.add(arr[i]);
            }
            isDelete = false;
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = {293, 1000, 395, 678, 94};
        int[] delete_list1 = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr1, delete_list1)));
        int[] arr2 = {110, 66, 439, 785, 1};
        int[] delete_list2 = {377, 823, 119, 43};
        System.out.println(Arrays.toString(solution(arr2, delete_list2)));
    }
}
