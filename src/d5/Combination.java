package d5;
/*
    조합
 */

import java.util.Arrays;

public class Combination {
    // 5개 중에서 3개를 선택하는 방법들을 출력하는 메서드
    // _5 C_3 을 출력하는 메서드
    public static void combSimple(int n) {
        int first;
        int second;
        int third;
        // i는 0 부터 n - 2 까지 반복하고,
        // 제일 처음 선택할 수 있는 것은 1 2 3 이다. (4, 5, ?)
        // 즉 n개중 3개를 뽑을 거라면 하나뽑고 나보다 더 크게 뽑을것들을 2개 남겨놔야 하기 떄문에 n보다 2칸 적게 선택
        for (int i = 0; i < n - 2; i++) {
            // j는 i+1 부터 n-1 까지 반복하고,(뒤에 한개는 남겨놔야함 즉 -1)
            first = i;
            for (int j = first + 1; j < n - 1; j++) {
                second = j;
                // k는 j+1 부터 n 까지 반복한다.
                for (int k = second + 1; k < n; k++) {
                    third = k;
                    System.out.println(first + " " + second + " " + third);

                }

            }

        }
    }

    public static void combRecur(int n, int r) {
        combRecurHelper(n, r, 0, 0, new int[r]);
    }


    // 재귀함수로 nCr 구하는 메서드
    public static void combRecurHelper(
            // 몇개(n)중에서 몇개(r)을 고를지
            int n, int r,
            // 여태까지 몇개의 원소를 골라는지를 타나내는 count
            int count,
            // 이번에 고를지 말지를 찬단 중이 숫자
            int next,
            // 조합 결과를 담을 배열
            int[] comb
    ) {
        // r개 골라야 하는데 디 골랐다.
        if (count == r) {
            System.out.println(Arrays.toString(comb));
        }
        // 만약, 내가 고르려고 고려한 애가 범위를 벗어날려 한다면
        else if (next == n) {
            return;  // 실행하던데로 돌아가는
        } else {
            // 만약 내가 아닌 next를 골랐다.
            comb[count] = next;
            // 1) count 번째 원소를 골랐으니, count+1 번쨰 원소를 고르러 가자.
            combRecurHelper(n, r, count + 1, next + 1, comb);

            // 2) count 번째 원소를 고르지 않고, 다음 원소를 확인하자.
            combRecurHelper(n, r, count, next + 1, comb);
        }
    }




    public static void main(String[] args) {
        combSimple(10);
        combRecur(5, 3);
    }
}
