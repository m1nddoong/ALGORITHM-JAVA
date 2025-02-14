package BOJ.classification.N03_해시를_사용한_집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String s;
        for (int i = 0; i < N; i++) {
            s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 만약 팔린 개수가 같다면
                if (map.get(o1).equals(map.get(o2))) {
                    return o1.compareTo(o2);
                }
                // 팔린 개수를 기준으로 정렬
                else {
                    return map.get(o2).compareTo(map.get(o1));
                }
            }
        });
        System.out.println(keySet.get(0));
    }
}
