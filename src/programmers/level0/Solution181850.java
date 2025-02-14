package programmers.level0;

// 정수 부분 : https://school.programmers.co.kr/learn/courses/30/lessons/181850
public class Solution181850 {
    public static int solution(double flo) {
        // return (int) Math.floor(flo);
        return (int) flo;
    }
    public static void main(String[] args) {
        double flo1 = 1.42;
        double flo2 = 69.32;
        System.out.println(solution(flo1));
        System.out.println(solution(flo2));
    }
}
