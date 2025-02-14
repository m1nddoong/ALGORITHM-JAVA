package BOJ.step.H16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 이동은 터뜨린 풍선 기준
// 1 출력
// 숫자 1 -> [1(터뜨리기), 2, 3, 4, 5] -> [2, 3, 4, 5] -> 3 (음수) 만큼 이동 (2번 뒤로 보내기) -> [3, 4, 5, 2] -> [4, 5, 2, 3] -> 4 출력 (맨앞)
// 숫자 4 -> [4(터뜨리기), 5, 2, 3] -> [5, 2, 3] -> -3 (음수) 만큼 이동(2번 앞으로 보내기) -> [3, 5, 2] -> [2, 3, 5] -> 5 출력 (맨뒤)
// 숫자 5 -> [2, 3, 5(터뜨리기)] -> [2, 3] -> -1 (음수) 만큼 이동(0번 앞으로 보내기) -> [2, 3] -> 3 출력 (맨뒤)
// 숫자 3 -> [2, 3(터뜨리기)] -> [2] -> 1 만큼 이동 -> [2] -> 2 출력(맨앞)

public class Main2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Deque<int[]> dq = new ArrayDeque<>();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            // [1, 2, 3, 4, 5]
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            // [3, 2, 1, -3, -1]
            dq.offer(new int[]{(i + 1), numbers[i]});
        }

        StringBuilder sb = new StringBuilder();
        while (!dq.isEmpty()) {
            int idx = dq.peek()[0]; // 풍선 번호 1
            int num = dq.peek()[1]; // 풍선 안에 적힌 숫자 3
            if (idx == 1) {
                sb.append(dq.remove()[0] + " ");
                if (num > 0) { // 3
                    num -= 1;
                    while (num-- > 0) {
                        dq.offerLast(dq.pollFirst());
                    }
                } else {
                    while (num++ < 0) {
                        dq.offerFirst(dq.pollLast());
                    }
                }
            } else {
                sb.append(dq.remove()[0] + " ");
                if (dq.size() == 0) {
                    break;
                }
                if (num > 0) {
                    num -= 1;
                    while (num-- > 0) {
                        dq.offerLast(dq.pollFirst());
                    }
                } else {
                    while (num++ < 0) {
                        dq.offerFirst(dq.pollLast());
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
