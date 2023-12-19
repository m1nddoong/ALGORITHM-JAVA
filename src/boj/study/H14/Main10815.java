package boj.study.H14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder builder = new StringBuilder();
        Map<String, Integer> cardMap = new HashMap<>();

        int n, m;
        n  = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            cardMap.put(st.nextToken(), 0);
        }

        m = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < m; i++) {
            if (cardMap.containsKey(st.nextToken())) {
                builder.append("1 ");
            } else {
                builder.append("0 ");
            }
        }
        System.out.println(builder);
    }
}
