package algorithm.d2;

// 주사위 게임 2

import java.util.Arrays;

public class Solution181930 {
    public static int solution(int a, int b, int c) {
        // 정렬을 하기위해 배열로 나열한다.
       int[] numbers = {a, b, c};
        // 정렬을 한다.
       Arrays.sort(numbers);

        // 1. 0번 원소와 2번 원소가 동일하면 3개 일치
        if (numbers[0] == numbers[2]) {
            return (a + b + c) * (a * a + b * b + c * c) *
                    (a * a * a + b * b * b + c * c * c);
        }
        // 2. 0번 원소가 1번 원소와 같거나(||) 1번 원소와 2번 원소가 같거나
        else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
            return (a + b + c) * (a * a + b * b + c * c);
        }
        // 3. 아니면 다 다르다.
        else {
          return (a + b + c);
        }
    }

}
