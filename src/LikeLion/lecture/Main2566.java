package LikeLion.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2566 {
    public static void main(String[] args) throws IOException {

        int[][] twoArray = new int[9][9];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < twoArray.length; i++) {
            String input = reader.readLine();
            // 이렇게 일단 전부 split 해서 numbers 에 저장하기
            String[] numbers = input.split(" ");
            for (int j = 0; j < twoArray.length; j++) {
                // int 배열에 값을 넣을때 Integer.parseInt
                twoArray[i][j] = Integer.parseInt(numbers[j]);
                // 잘못된 방법 : twoArray[i][j] = Integer.parseInt(input.split(" "));
            }
        }

        int max = twoArray[0][0];
        int maxIndexI = 0;
        int maxIndexJ = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray.length; j++) {
                if (max <= twoArray[i][j]) {
                    max = twoArray[i][j];
                    maxIndexI = i+1;
                    maxIndexJ = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxIndexI + " " + maxIndexJ);
    }
}
