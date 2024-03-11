package boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 최소 회의실 개수 : https://www.acmicpc.net/problem/19598
// 버리는 회의가 없기 떄문에 시작 시간을 기준을 해야한다?
public class Main19598 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 회의의 개수 : N
        int meetingCount = Integer.parseInt(reader.readLine());
        int[][] meetings = new int[meetingCount][2]; // 시작시간 종로시간을 담을 회의 배열

        // 회의실 개수
        int answer = 0;

        for (int i = 0; i < meetingCount; i++) {
            String[] meetingInfo = reader.readLine().split(" ");
            meetings[i][0] = Integer.parseInt(meetingInfo[0]);
            meetings[i][1] = Integer.parseInt(meetingInfo[1]);
        }

        // 회의 시작 시간을 기준으로 오름차순 정렬
        Arrays.sort(meetings, (o1, o2) -> o1[0] - o2[0]);


        int lastEnd = 0;

        for (int i = 0; i < meetingCount; i++) {
            if (meetings[i][0] >= lastEnd) {
                // 첫번째 회의의 종료시간 = 40
                lastEnd = meetings[i][1];
            }
            else {

            }

        }



        for (int i = 0; i < meetingCount; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(meetings[i][j] + " ");
            }
            System.out.println();
        }
    }
}



/*
3
0 40
15 30
5 10


2
*/
