package boj.study.H6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 단어 체커 : https://www.acmicpc.net/problem/1316
public class Main1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 그룸 단어의 개수
        int count = 0;

        for (int i = 0; i < N; i++) {
            // n개의 단어를 입력받자.
            String str = br.readLine();

            // str 이 그룹단어인지 아닌지 체크
            if (GroupWorkCheck(str)) count++;
        }
    }

    // 입력받은 문자열이 그룹 단어인지 체크
    // 그룹 단어 : 각 문자가 연속해서 나타나는 경우만을 의미
    public static boolean GroupWorkCheck(String str) {
        // 일단 문자열을 문자로 쪼갠다.
        char[] words = str.toCharArray();
        // a ~ z 까지 방문의 유무를 판단할 배열
        boolean[] visited = new boolean[26];

        int temp, i = 0;

        // 만약 a 가 나왔다면 a 를 계속 받고,
        while(i < words.length) {
            temp = words[i] - 97; // 첫 문자를 아스키코드로 temp에 저장
            i++;
            while ((words[i] - 97) != temp) { // 다음 문자를 계속 받으면사, 첫 문자와와 비교
                visited[temp] = true; // 첫 문자는 방문했다.
                i++;
            }
        }

        return true;
        // 그 다음에 받은 문자가 만약 a가 아닌 b라면
        // a는 방문 했다고 체크한 뒤, 위와 같이 쭉 같은 문자 받기

        // 근데 만약 나중에 a가 또 나오면 이미 방문 했으므로 그룹 문자가 아님.
    }
}
