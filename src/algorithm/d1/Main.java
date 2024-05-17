package algorithm.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ 문제 풀이 템플릿
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        // split() : 주어진 인자를 정규 표현식으로 활용해서 기준으로 삼아
        // 문자열을 나눈 배열로 반환한다.
        String[] splitString = input.split(" ");

        // 3003 문제 풀어보기

        // 1. 기준이 되는 체스말을 정수 배열로 저장
        int[] rightPieces = {1, 1, 2, 2, 2, 8};
        // int[] splitInt = new int[6];

        // 2. 입력받은 각각의 체스말을 살펴본다.
        // 어떤 말인지를 보기 위해 fori 반복을 한다.
        for (int i = 0; i < 6; i++) {
            // 3. 이번 말을 확인한다.
            String pieceRaw = splitString[i];
            // 4. 동일한 말에서, 기준 갯수와 다른 만큼 새로 할당한다.
            rightPieces[i] -= Integer.parseInt(pieceRaw);
            // splitInt[i] = Integer.parseInt(splitString[i]);
            // System.out.print(rightPieces[i] - splitInt[i] + " ");
        }

        // 5. 출력
        System.out.println(String.format(
                "%d %d %d %d %d",
                rightPieces[0],
                rightPieces[1],
                rightPieces[2],
                rightPieces[3],
                rightPieces[4],
                rightPieces[5]
        ));
    }
}
