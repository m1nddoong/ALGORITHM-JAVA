package programmers.basic;

// 특별한 이차원 배열 2 : https://school.programmers.co.kr/learn/courses/30/lessons/181831
public class Solution181831 {
    public static int solution(int[][] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != arr[j][i]) answer = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        System.out.println(solution(arr1));
        int[][] arr2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
        System.out.println(solution(arr2));
    }
}
