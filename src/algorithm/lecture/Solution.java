package algorithm.lecture;

class Solution {
    public static int solution(int a, int d, boolean[] included) {
        int[] intInclude = new int[included.length];
        int answer = 0;
        // 1항이 a

        for (int i = 0; i < included.length; i++) {
            intInclude[i] += a + i * d;
            if (included[i]) {
                answer += intInclude[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(3, 4, included));
    }
}