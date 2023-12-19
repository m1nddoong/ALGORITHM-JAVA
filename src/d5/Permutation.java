package d5;

/*
    순열
 */

import java.util.Arrays;

public class Permutation {

    // 0 ~ n-1의 숫자로 만들 수 있는 숫자 나열 전부 출력하는 메서드 --> 3P3
    public static void permSimple(int n) {
        int first;
        int second;
        int third;

        // 0에서 n사이의 숫자를 차례대로 골라본다.
        for (int i = 0; i < n; i++) {
            // 첫 번쨰 숫자를 골랐다.
            first = i;
            // 0에서 n사이의 숫자 중, 아직 고르지 않은 숫자를 골라본다.
            for (int j = 0; j < n; j++) {
                // 이미 고른 숫자라면 나머지는 실행하지 않는다.
                if (j == first) {
                    continue;
                }
                second = j;
                // 0 에서 n사이의 숫자 중, 아직 고르지 않은 숫자를 골라본다.
                for (int k = 0; k < n; k++) {
                    if (k == first || k == second) {
                        continue;
                    }
                    third = k;
                    System.out.println(first + " " + second + " " + third);
                }
            }
        }

    }

    // 재귀함수로 더 많은 원소를 선택하는 순열을 만들어보자.
    public static void permRecurHelper (
            // 순열을 구할때 필요한 것 : 고르는 대상, 고르는 갯수
            int n, int r,
            // 내가 지금 몇번째 원소를 고르고 있는지 : 몇번째 깊이냐 -> 트리구조 생각
            int depth,
            // 어떤 요소들을 사용했는지 저장하는 배열
            boolean[] used,
            // 결과를 저장하기 위한 배열
            int[] perm
    ) {
        // 내가 고른것의 갯수가 고를 것의 개수와 같아지면 중단.
        if (depth == r) {
            System.out.println(Arrays.toString(perm));
        } else {
            // n개의 원소중 하나를 선택하는 for
            for (int i = 0; i < n; i++) {
                // 이미 선택했다면 스킵
                if (used[i])
                    continue;

                // 선택을 할때 first = i; 의 형태로 작성했던 부분
                perm[depth] = i;
                // 내가 이번에 i를 선택했다는 것을 기록하고
                used[i] = true;

                // 중첩된 for 대신 재귀 호출
                permRecurHelper(n, r, depth + 1, used, perm); // 그 다음 숫자를 선택하면 돼! 라고 +1 해주기
                // 이 i에서 출발하는 순열을 다 찾으면, 다음 i를 쓰기 위해 기록 변경

                used[i] = false;  // 0 1 2, 0 2 1 했으면 0은 선택되었으니까 true 로 기록 하고 재귀 -> 이후 다시 false 로
            }
        }
    }

    // 시용성을 위해 실제 메서드를 분리한다. (n과 r만 있어도 실행이 되게끔)
    public static void permRecursive(int n, int r) {
        permRecurHelper(n, r, 0, new boolean[n], new int[r]);

    }

    public static void main(String[] args) {
        // permSimple(9);
        // n개의 원소에서 고르는데, 결과를 저장하기 위한 배열
        // 제일 먼저 첫번쨰를 선택한다고 해서 depth = 0
        // 5개중 2개 고르기,
        permRecursive(5, 2);
    }
}
