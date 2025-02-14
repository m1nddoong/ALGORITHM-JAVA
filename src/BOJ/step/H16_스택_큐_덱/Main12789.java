package BOJ.step.H16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

// 도키도키 간식드리미

// 5 4 1 3 2 -> Nice
// 4 5 1 3 2 -> Sad
// 1이 나올떄까지 앞에는 stack 에 넣어야함.


public class Main12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 학생 수 N
        int N = Integer.parseInt(reader.readLine());

        Queue<Integer> q = new LinkedList<>(); // 대기열
        Stack<Integer> s = new Stack<>(); // 추가 대기열

        StringTokenizer st = new StringTokenizer(reader.readLine());

        while (st.hasMoreTokens()) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int num = 1;
        while (!q.isEmpty()) {
            if (q.peek() == num) {
                q.poll();
                num++;
            } else if (!s.empty() && s.peek() == num) {
                s.pop();
                num++;
            } else {
                s.push(q.poll());
            }
        }
        while (!s.isEmpty()) {
            if (s.peek() == num) {
                s.pop();
                num++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}

