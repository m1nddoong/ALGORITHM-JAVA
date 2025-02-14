package programmers.level0;
// 첫 번쨰로 나오는 음수 : https://school.programmers.co.kr/learn/courses/30/lessons/181896
public class Solution181896 {
    public static int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list1 = {12, 4, 15, 46, 38, -2 , 15};
        System.out.println(solution(num_list1));
        int[] num_list2 = {13, 22, 53, 24, 15, 6};
        System.out.println(solution(num_list2));


    }
}
