package BOJ.step.H24_누적_합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나머지 합 : https://www.acmicpc.net/problem/10986
public class Main10986 {
    public static void main(String[] args) throws Exception {
        solution();
    }

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = 0;
        int[] cnt = new int[1000];
        long answer = 0;
        st = new StringTokenizer(br.readLine());
        while (n-->0) {
            int cur = Integer.parseInt(st.nextToken());
            sum += cur;
            sum %= m;
            answer += cnt[sum];
            cnt[sum]++;
            if (sum==0) answer++;
        }
        System.out.println(answer);
    }
}
