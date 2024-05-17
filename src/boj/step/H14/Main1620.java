package boj.step.H14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String input = reader.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);
        Map<String, Integer> pokemon = new HashMap<>();
        Map<Integer, String> reversePokemon = new HashMap<>();
        for (int i = 1; i < n+1; i++) {
            String name = reader.readLine();
            pokemon.put(name, i);
            reversePokemon.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            String quiz = reader.readLine();
            if (Character.isDigit(quiz.charAt(0))) {
                builder.append(reversePokemon.get(Integer.parseInt(quiz))).append("\n");
            } else {
                builder.append(pokemon.get(quiz)).append("\n");
            }
        }
        System.out.println(builder);
    }
}
