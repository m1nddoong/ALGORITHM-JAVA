package programmers.basic;


// 이어 붙인 수 : https://school.programmers.co.kr/learn/courses/30/lessons/181928
public class Solution181928 {
    public static int solution(int[] num_list) {
        StringBuilder evenStr = new StringBuilder();
        StringBuilder oddStr = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStr.append(num);
            } else {
                oddStr.append(num);
            }
        }

        int evenSum = Integer.parseInt(evenStr.toString());
        int oddSum = Integer.parseInt(oddStr.toString());

        return evenSum + oddSum;
    }

    public static void main(String[] args) {
        int[] num_list1 = {3, 4, 5, 2, 1};
        //int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list1));
        //System.out.println(solution(num_list2));
    }
}
