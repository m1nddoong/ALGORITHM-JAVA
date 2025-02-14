package BOJ.step.H14_집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String, String> infoMap = new HashMap<>();
        String input, name, inOut;

        for (int i = 0; i < n; i++) {
            input = reader.readLine();
            name = input.split(" ")[0];
            inOut = input.split(" ")[1];
            if ("leave".equals(inOut)) {
                if (infoMap.containsKey(name) && infoMap.get(name).equals("enter")) {
                    infoMap.remove(name);
                }
            } else {
                infoMap.put(name, inOut);
            }
        }
        // 사전의 역순 출력?
        List<String> nameList = new ArrayList<>(infoMap.keySet());
        Collections.sort(nameList);
        for (int i = nameList.size()-1; i >= 0 ; i--) {
            System.out.println(nameList.get(i));
        }
    }
}
