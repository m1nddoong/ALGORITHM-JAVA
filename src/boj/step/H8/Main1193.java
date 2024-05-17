package boj.step.H8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분수찾기 : https://www.acmicpc.net/problem/1193
public class Main1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int crossCount = 1, prevCountSum = 0;
        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 칸의 개수
            if (x <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) { // 대각선 칸의 개수가 홀수라면
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
                    System.out.print((crossCount - (x - prevCountSum - 1)) + "/" + (x - prevCountSum));
                    break;
                }
                else { // 대각선상의 블럭의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.print((x - prevCountSum) + "/" + (crossCount - (x - prevCountSum - 1)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }
}


