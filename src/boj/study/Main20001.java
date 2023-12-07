package boj.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main20001 {

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 고무오리 디버깅 시작
        String line  = reader.readLine();
        int count = 0;

        // 마지막에 "고무오리 디버깅 끝"을 입력 받을때 까지 반복한다.
        while (true) {
            line = reader.readLine();
            // 종료 조건
            if (line.equals("고무오리 디버깅 끝")) {
                break;
            }

            // 입력이 "문자" 먄 count++
            if (line.equals("문자")) {
                count++;
            }
            // 입력이 "고무오리"면 count--


            // 단, count == 0 이
        }

    }
}
