package programmers.알고리즘_고득점_Kit.N06_탐욕법;

import java.util.Arrays;
import java.util.HashSet;

// 체육복 : https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Solution42862 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        HashSet<Integer> resList = new HashSet<>();
        HashSet<Integer> losList = new HashSet<>();

        // 1️⃣ 정렬 추가 (그리디 방식으로 앞번호 학생에게 먼저 빌려주기 위해)
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 2️⃣ reserve에 있는 학생을 HashSet에 추가
        for (int i : reserve)
            resList.add(i);

        // 3️⃣ lost 배열을 확인하면서 여벌이 있으면 제외
        for (int i : lost) {
            if (resList.contains(i)) {
                resList.remove(i); // 본인이 입어야 하므로 제거
            } else {
                losList.add(i); // 실제로 체육복이 없는 학생만 추가
            }
        }

        // 4️⃣ 정렬된 lost 순서대로 빌려줄 수 있는지 확인
        for (int i : lost) {
            if (losList.contains(i)) { // 체육복 없는 학생이면
                if (resList.contains(i - 1)) { // 앞 번호 학생이 빌려줄 수 있으면
                    resList.remove(i - 1);
                    losList.remove(i);
                } else if (resList.contains(i + 1)) { // 뒷 번호 학생이 빌려줄 수 있으면
                    resList.remove(i + 1);
                    losList.remove(i);
                } else { // 빌려줄 수 없으면
                    answer--;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reserve1 = {1, 3, 5};
        System.out.println(solution(n1, lost1, reserve1));
        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        System.out.println(solution(n2, lost2, reserve2));
        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        System.out.println(solution(n3, lost3, reserve3));
    }
}
