package programmers.basic;

// rny_string : https://school.programmers.co.kr/learn/courses/30/lessons/181863
public class Solution181863 {
    public static String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();

        for (char c : rny_string.toCharArray()) {
            if (c == 'm') {
                sb.append("rn");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();

        // 한번에 바꾸기
        // return rny_string.replaceAll("m", "rn");
    }

    public static void main(String[] args) {
        String rny_string1 = "masterpiece";
        String rny_string2 = "programmers";
        String rny_string3 = "jerry";
        String rny_string4 = "burn";
        System.out.println(solution(rny_string1));
        System.out.println(solution(rny_string2));
        System.out.println(solution(rny_string3));
        System.out.println(solution(rny_string4));
    }
}

