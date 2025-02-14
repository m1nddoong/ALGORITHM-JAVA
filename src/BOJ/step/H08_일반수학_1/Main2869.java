package BOJ.step.H08_일반수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다 : https://www.acmicpc.net/problem/2869
public class Main2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 낮에 올라갈 수 있는 길이 A
        int B = Integer.parseInt(st.nextToken()); // 밤에 잠자는 동안 미끄러니는 길이 B
        int V = Integer.parseInt(st.nextToken()); // 막대기의 높이 V

        int count = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) count++;
        System.out.println(count);
    }
}

