package programmers.level0;

// 문자열 묶기 : https://school.programmers.co.kr/learn/courses/30/lessons/181855
public class Solution181855 {
    public static int solution(String[] strArr) {
        int max = 0;
        int[] arr = new int[30];
        for (String s : strArr) {
            arr[s.length() - 1]++;
        }

        for (int i = 0; i < 30; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};
        System.out.println(solution(strArr));

    }
}
