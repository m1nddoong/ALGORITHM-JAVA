package leetcode;

import java.io.BufferedReader;

public class TwoSum {
    public static void main(String[] args) {
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int index;
            int diff;
            int[] result = new int[2];
            // 일단 for 문을 돌면서 정수값 하나씩 선택한다.
            for (int i=0; i < nums.length; i++) {
                index = i;
                if (target > nums[i]) {
                    // 그 선택한 값과 target 의 차이를 구하고
                    diff = target - nums[i];
                    // 그 차이값이 nums 배열에 있다면 그 값의 인덱스를 result 배열에 저장한다.
                    for (int j=0; j < nums.length; j++) {
                        if (nums[j] == diff) {
                            result[0] = i;
                            result[1] = j;
                        }
                    }
                }
                else continue;
            }
            return result;
        }
    }
}
