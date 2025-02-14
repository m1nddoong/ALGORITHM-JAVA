package programmers.level0;

// 조건에 맞게 수열 변환하기 2 : https://school.programmers.co.kr/learn/courses/30/lessons/181881
public class Solution181881 {
    public static int solution(int[] arr) {
        int x = 0;
        while (true) {
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = 2 * arr[i] + 1;
                } else {
                    idx++;
                }
                if (idx == arr.length) {
                    return x;
                }
            }
            x++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(solution(arr));
    }
}
