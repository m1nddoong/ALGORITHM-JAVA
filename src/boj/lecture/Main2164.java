package boj.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        // 아이템 넣을 떄 - queue.offer
        // 아이템 회수할 떄 - queue.poll
        // Queue를 만든다.
        Queue<Integer> queue = new LinkedList<>();

        // for 를 이용해 1 ~ n까지의 n개의 숫자를 Queue에 넣는다.
        for (int i = 1; i < n+1; i++) {
            queue.offer(i);
        }

        // Queue의 크기가 1보다 클 동안
        while (queue.size() > 1) {
            // Queue의 제일 앞에 아이템을 버리고, (poll)
            queue.poll();
            // 그 다음 앞의 아이템을 뺴서 (poll)
            int front = queue.poll();
            // 제일 뒤로 넣는다 (offer)
            queue.offer(front);
        }


        // 마지막 남은 아이템을 출력한다.
        System.out.println(queue.poll());
    }
}
