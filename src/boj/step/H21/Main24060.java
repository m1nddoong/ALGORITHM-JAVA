package boj.step.H21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main24060 {
    static int[] A, tmp;
    static int result = -1;
    static int count = 0;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[N];
        mergeSort(A, 0, N - 1);
        System.out.println(result);
    }

    public static void mergeSort(int[] array, int p, int r) {
        if (count > K) return;
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    public static void merge(
            int[] array,
            int p,
            int q,
            int r
    ) {
        int i = p;
        int j = q+1;
        int t = 0;

        while (i <= q && j <= r) {
            if (array[i] <= array[j]) {
                tmp[t++] = array[i++];
            }
            else {
                tmp[t++] = array[j++];
            }
        }
        while (i <= q) {
            tmp[t++] = array[i++];
        }
        while (j <= r) {
            tmp[t++] = array[j++];
        }
        i = p;
        t = 0;
        while (i <= r) {
            count++;

            if (count == K) {
                result = tmp[t];
                break;
            }

            array[i++] = tmp[t++];
        }

    }
}
