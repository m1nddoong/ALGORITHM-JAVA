package BOJ.step.H20_심화_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Set<String> dancer = new HashSet<>();
        dancer.add("ChongChong");

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            // 총총이를 만난다면
            if (dancer.contains(A)) {
                dancer.add(B);
            } else if (dancer.contains(B)) {
                dancer.add(A);
            }
        }
        System.out.println(dancer.size());
    }
}
