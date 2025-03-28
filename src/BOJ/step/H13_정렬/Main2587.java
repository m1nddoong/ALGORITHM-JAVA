package BOJ.step.H13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            sum += list.get(i);
        }
        System.out.println(sum / 5);
        Collections.sort(list);
        System.out.println(list.get(2));

    }
}
