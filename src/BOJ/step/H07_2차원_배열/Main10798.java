package BOJ.step.H07_2차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세로 읽기 : https://www.acmicpc.net/problem/10798
public class Main10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix = new char[5][15]; // 5행 15열
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                matrix[i][j] = str.charAt(j);
            }
        }
        verticalRead(matrix);

    }

    public static void verticalRead(char[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                char c = matrix[j][i];
                if (c != '\0') {
                    sb.append(c);
                }
            }
        }
        System.out.println(sb);
    }
}
