package programmers.level1;

import java.util.Arrays;

// [1차] 비밀지도 : https://school.programmers.co.kr/learn/courses/30/lessons/17681

/**
 * 뒤에서부터 넣으면 됨
 *
 */
public class Solution17681 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;

        /*
        String[][] map = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = " ";
            }
        }
        decode(map, arr1, n);
        decode(map, arr2, n);

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j]);
            }
            result[i] = sb.toString();
        }

        return result;
        */

    }

    /*
    public static void decode(String[][] map, int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            String piece = Integer.toBinaryString(arr[i]);
            if (piece.length() < n) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < n - piece.length(); k++) {
                    sb.append("0");
                }
                sb.append(piece);
                piece = sb.toString();
            }
            String[] pieceArr = piece.split("");
            for (int j = 0; j < pieceArr.length; j++) {
                if (Integer.parseInt(pieceArr[j]) == 1 && map[i][j].equals(" ")) {
                    map[i][j] = "#";
                }
            }
        }
    }
    */

    public static void main(String[] args) {
        int n1 = 5;
        int[] arrA1 = {9, 20, 28, 18, 11};
        int[] arrA2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n1, arrA1, arrA2)));
        int n2 = 6;
        int[] arrB1 = {46, 33, 33, 22, 31, 50};
        int[] arrB2 = {27, 56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution(n2, arrB1, arrB2)));
    }
}
