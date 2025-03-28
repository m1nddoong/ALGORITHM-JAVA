package BOJ.classification.N01_조합론;

import java.io.*;
import java.util.*;

// [실버 3] 다음 순열 : https://www.acmicpc.net/problem/10972
public class Main10972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] inputNums = new int[N]; // 입력받은 순열
        for (int i = 0; i < N; i++) {
            inputNums[i] = Integer.parseInt(input[i]);
        }

        if (nextPerm(inputNums)) {
            for (int num : inputNums) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println(-1);
        }

    }

    public static boolean nextPerm(int[] arr) {
        int N = arr.length;
        int i = N - 2;
        // 1. 뒤에서부터 arr[i] < arr[i+1] 만족 i 찾기
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        // 2. i가 -1이면 더 이상 순열이 없다는 뜻
        if (i == -1) {
            return false;
        }
        // 3. i보다 큰 값들 중에서 가장 작은 값 (즉, arr[j]) 을 찾기
        int j = N - 1;
        while (arr[i] >= arr[j]) {
            j--;
        }

        // 4. arr[i] 와 arr[j] 의 swap
        swap(arr, i, j);

        // 5. i+1 부터 끝까지 오름차순 정렬
        reverse(arr, i+1, N-1);
        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }


}
