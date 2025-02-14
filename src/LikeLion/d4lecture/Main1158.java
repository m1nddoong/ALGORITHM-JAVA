package LikeLion.d4lecture;

// https://www.acmicpc.net/problem/1158
// 요세푸스 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] info = reader.readLine().split(" ");
        int N = Integer.parseInt(info[0]);
        int K = Integer.parseInt(info[1]);

        // 정답을 담기 위한 리스트
        // 틈세 팀 : 내가 담을 원소의 갯수를 미리 알고 있다면,
        // 생성자 사용시 그 값을 전달해서 배열을 미리 키워둘 수 있다.
        List<Integer> result = new ArrayList<>(N);
        // 요새푸스 문제 정의대로 사람을 뺴기 위한 큐
        Queue<Integer> people = new LinkedList<>();
        // 사람을 넣자 (N이 7이라면 1~7까지 사람이 있는것)
        for (int i = 1; i < N+1; i++) {
            // 큐에 넣기! offer 사용
            people.offer(i);
        }
        // 현재 몇번쨰 사람인지를 기록한 뒤,
        int round = 0;
        // k == 3 일떄 탈락해야되는데 지금같이 수동으로 round 를 증가시켜 0 1 2 순이라면
        // k-1 즉 2번째가 탈락해야함

        // 큐가 빌떄까지 반복하며,
        while (!people.isEmpty()) {
            int person = people.poll();
            // 이번 사람이 탈락할 차례인지 판단
            if (round == K - 1) {
                // 맞으면 result로
                result.add(person);
                // 초기화
                round = 0;
            }
            else {
                // 아니면 다시 큐로 (뒤로 다시 넣어줌)
                people.offer(person);
                round++;

            }
        }
        // 이렇게 해줘도 똑같음
        // 모든 클래스는 object 클래스를 상속받고, 그 안의 toString() 이 있는데
        // 다음과 같이 문자열로 바꿔준다.
        String resultString = result.toString();
        // 부분 문자열 -> 양쪽의 대괄호가 빠짐
        resultString = resultString.substring(1, resultString.length() - 1);
        // 스트링 빌더로 양쪽에 '<', '>' 붙여주기
        StringBuilder answerBuilder = new StringBuilder();
        answerBuilder.append('<');
        answerBuilder.append(resultString);
        answerBuilder.append('>');

        System.out.println(answerBuilder);

    }
}












