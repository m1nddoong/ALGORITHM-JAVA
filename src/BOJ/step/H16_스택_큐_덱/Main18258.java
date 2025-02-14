package BOJ.step.H16_스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(reader.readLine());
        int element = -1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            while (st.hasMoreTokens()) {
                switch (st.nextToken()) {
                    case "push":
                        element = Integer.parseInt(st.nextToken());
                        q.offer(element);
                        break;
                    case "front":
                        if (q.isEmpty()) {
                            builder.append(-1).append("\n");
                        } else {
                            builder.append(q.peek()).append("\n");
                        }
                        break;
                    case "back":
                        if (q.isEmpty()) {
                            builder.append(-1).append("\n");
                        } else {
                            builder.append(element).append("\n");
                        }
                        break;
                    case "size":
                        builder.append(q.size()).append("\n");
                        break;
                    case "empty":
                        if (q.isEmpty()) {
                            builder.append(1).append("\n");
                        } else {
                            builder.append(0).append("\n");
                        }
                        break;
                    case "pop":
                        if (q.isEmpty()) {
                            builder.append(-1).append("\n");
                        } else {
                            builder.append(q.poll()).append("\n");
                        }
                        break;
                }
            }
        }
        System.out.println(builder);
    }
}
