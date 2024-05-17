package algorithm.d5lecture;

// https://www.acmicpc.net/problem/2503
// 숫자 야구

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 질문한 횟수 받기
        int tries = Integer.parseInt(reader.readLine());
        // 각 질문에 대한 답변을 저장하는 2차원 배열
        // countInfo[i][0] == i번째 질문의 숫자
        // countInfo[i][1] == i번째 질문의 스트라이크
        // countInfo[i][2] == i번째 질문의 볼
        int[][] countInfo = new int[tries][3];

        // 입력을 받는다.
        for (int i = 0; i < tries; i++) {
            String[] info = reader.readLine().split(" ");
            countInfo[i][0] = Integer.parseInt(info[0]); // 질문의 숫자 입력
            countInfo[i][1] = Integer.parseInt(info[1]); // 스트라이크 입력
            countInfo[i][2] = Integer.parseInt(info[2]); // 볼의 개수 입력
        }

        // 정답의 개수
        int answers = 0;

        // 만들 수 있는 모든 숫자의 순열을 만든다.
        // 1 ~ 9의 숫자 중 3개를 골라 나열한다. (중복없이)
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == j) {
                    continue; // 중복되면 쓰지 않는다.
                }
                for (int k = 1; k < 10; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    // System.out.println(i + " " + j + " " + k);
                    // 장답 후보자 완성했다.
                    // 이 정답 후보자와, 질문했던 숫자를 비교해서
                    // 동일한 볼 카운트가 나오는지 확인해야 한다.

                    boolean flag = true;
                    // 시도 반복 하기
                    for (int t = 0; t < tries; t++) {
                        // 질문한 숫자
                        int target = countInfo[t][0];
                        // 질문한 숫자의 지금 정답의 볼카운트
                        int[] ballCount = getCount(
                                target,
                                i, j, k
                        );
                        // 결과 볼카운트랑 기록된 볼카운트랑 비교
                        if (ballCount[0] != countInfo[t][1] ||
                                ballCount[1] != countInfo[t][2]) {
                            // 정답 후보 탈락
                            flag = false;
                            break;
                        }
                    }
                    // 모든 질문을 통과하면
                    if (flag) answers++;
                }
            }
        }
        System.out.println(answers);
    }






    // 만든 정답 후보와, 질의한 숫자를 비교해서, 볼 카운트를 반환하는 메서드
    public static int[] getCount(
            // 질문한 숫자
            int target,
            // 정답인 숫자 - 백의 자리 십의 자리 입의 자리
            int inH, int inT, int inO
    ) {
        // 짏문한 숫자를 각 자릿수로 분해한다.
        int targetH = target / 100;
        int targetT = (target % 100) / 10;
        int targetO = target % 10;

        // 긱긱을 배열로 묶어본다.
        int[] inNums = {inH, inT, inO};
        // 비교할 숫자들
        int[] targetNums = {targetH, targetT, targetO};
        // 볼카운트를 저장하기 위한 변수
        int strikes = 0;
        int balls = 0;

        // 볼카운트 비교하기
        for (int i = 0; i < 3; i++) {
            // 스트라이크 판별
            if (inNums[i] == targetNums[i]) {
                strikes++;
            }
            // 스트라이크가 아니면 볼을 판별
            else {
                for (int j = 0; j < 3; j++) {
                    if (inNums[i] == targetNums[j]) {
                        balls++;
                        break;
                    }
                }
            }

        }
        // strikes 와 balls 을 바탕으로 정수 배열 생성 후 리턴
        return new int[]{strikes, balls};
    }
}

















