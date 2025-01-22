package programmers.basic;

// 가까운 1 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/181898
public class Solution181898 {
    public static int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1};
        int idx1 = 1;
        System.out.println(solution(arr1, idx1));
        int[] arr2 = {1, 0, 0, 1, 0, 0};
        int idx2 = 4;
        System.out.println(solution(arr2, idx2));
        int[] arr3 = {1, 1, 1, 1, 0};
        int idx3 = 3;
        System.out.println(solution(arr3, idx3));
    }
}
