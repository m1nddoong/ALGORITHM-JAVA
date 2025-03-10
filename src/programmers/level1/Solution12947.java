package programmers.level1;

// 하샤드 수 : https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class Solution12947 {
    public static boolean solution(int x) {
        int sum = 0;
        for (String str : String.valueOf(x).split("")) {
            sum += Integer.parseInt(str);
        }
        return x % sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 12;
        int x3 = 11;
        int x4 = 13;
        System.out.println(solution(x1));
        System.out.println(solution(x2));
        System.out.println(solution(x3));
        System.out.println(solution(x4));
    }
}
