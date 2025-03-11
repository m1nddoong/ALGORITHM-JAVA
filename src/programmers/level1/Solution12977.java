package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 소수 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class Solution12977 {
    public static int solution(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime((nums[i] + nums[j] + nums[k]))) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            for (int j = i; j < num; j += i) {
                if (num % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution(nums1));
        int[] nums2 = {1, 2, 7, 6, 4};
        System.out.println(solution(nums2));
    }
}
