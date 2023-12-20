package boj.study.H16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main28278 {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(reader.readLine());
        Stack<Integer> intStack = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine()); // 1과 3을 입력받음
            while(st.hasMoreTokens()) { // 1과 3을 순서대로 입력 받는데
                switch (Integer.parseInt(st.nextToken())) {
                    case 4:
                        // 스택이 비어있으면
                        if (intStack.empty())
                            builder.append(1).append("\n");
                        else {
                            builder.append(0).append("\n");
                        }
                        break;
                    case 1:
                        intStack.push(Integer.parseInt(st.nextToken()));
                        break;
                    case 3:
                        builder.append(intStack.size()).append("\n");
                        break;
                    case 2:
                        if (intStack.empty()) {
                            builder.append(-1).append("\n");
                        } else {
                            builder.append(intStack.pop()).append("\n");
                        }
                        break;
                    case 5:
                        if (intStack.empty()) {
                            builder.append(-1).append("\n");
                        } else {
                            builder.append(intStack.peek()).append("\n");
                        }
                        break;
                }
            }
        }
        System.out.println(builder);
    }
}
