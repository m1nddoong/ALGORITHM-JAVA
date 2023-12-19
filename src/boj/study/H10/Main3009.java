package boj.study.H10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 네 번째 점 : https://www.acmicpc.net/problem/3009
public class Main3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] rect = new int[3][2];

        for (int i = 0; i < 3; i++) {
            String input = reader.readLine();
            rect[i][0] = Integer.parseInt(input.split(" ")[0]);
            rect[i][1] = Integer.parseInt(input.split(" ")[1]);

        }
        int[] col = new int[2];

        for (int i = 0; i < 2; i++) {
            col[i] += rect[0][i];
            // 각 열마다 숫자 두개는 같고 나머지 하나는 다르다.
            if (col[i] != rect[1][i] && col[i] != rect[2][i]) { // 1행0열과 2행0열이 col1 이랑 다를떄
                sb.append(col[i]).append(" ");
            }
            // 둘중에 하나라도 같은게 있을텐데
            else {
                if (col[i] == rect[1][i]) { //같은 것이 1행0열의 값이라면
                    sb.append(rect[2][i]).append(" ");
                } else { // 같은 것이 2행0열의 값이라면
                    sb.append(rect[1][i]).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
