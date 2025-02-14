package BOJ.step.H10_기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 삼각형과 세 변 : https://www.acmicpc.net/problem/5073
public class Main5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str.equals("0 0 0")) {
                break;
            }
            int[] sides = new int[3];
            sides[0] = Integer.parseInt(str.split(" ")[0]);
            sides[1] = Integer.parseInt(str.split(" ")[1]);
            sides[2] = Integer.parseInt(str.split(" ")[2]);

            int remain = 0;
            int max = sides[0];
            for (int i = 1; i < 3; i++) {
                if (max < sides[i]) {
                    remain += max;
                    max = sides[i];
                } else {
                    remain += sides[i];
                }
            }

            if (max < remain) {
                if (sides[0] == sides[1] && sides[1] == sides[2]) {
                    sb.append("Equilateral").append("\n");
                } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
                    sb.append("Isosceles").append("\n");
                } else {
                    sb.append("Scalene").append("\n");
                }
            } else {
                sb.append("Invalid").append("\n");
            }
        }
        System.out.println(sb);
    }
}
