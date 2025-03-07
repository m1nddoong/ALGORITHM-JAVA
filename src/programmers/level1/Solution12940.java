package programmers.level1;

import java.util.Arrays;
// 최대공약수와 최소공배수
public class Solution12940 {
    public static int[] solution(int n, int m) {
        // 최대 공약수(유클리드 호제법) : GCD(a, b) = GCD(b, a % b) (b > 0)
        // 최소 공배수 : LCM(a, b) = a * b / GCD(a, b)
        int gcd = getGCD(Math.max(n, m), Math.min(n, m));
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int m1 = 12;
        System.out.println(Arrays.toString(solution(n1, m1)));
        int n2 = 2;
        int m2 = 5;
        System.out.println(Arrays.toString(solution(n2, m2)));
    }
}
