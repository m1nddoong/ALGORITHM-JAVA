package programmers.d4lecture;

public class Solution181925 {
    public String solution(int[] numLog) {
        StringBuilder answerBuilder = new StringBuilder();
        // 인덱스(순서)가지고 순회를 할것이며,
        // n개의 원소가 있다면 두개씩 비교헀을떄 몇번 반복해야할까? : n-1
        for (int i = 0; i < numLog.length - 1; i++) {
            int diff = numLog[i + 1] - numLog[i];
            // switch 사용해보자. (얼마만큼 차이가 나는가에 따른)
            switch (diff) {
                case 1:
                    answerBuilder.append('w');
                    break;
                case -1:
                    answerBuilder.append('s');
                    break;
                case 10:
                    answerBuilder.append('d');
                    break;
                case -10:
                    answerBuilder.append('a');
                    break;
            }
        }
        return answerBuilder.toString();
    }
}
