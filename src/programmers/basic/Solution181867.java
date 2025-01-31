package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// x 사이의 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/181867
public class Solution181867 {
    public static int[] solution(String myString) {
//        List<Integer> answer = new ArrayList<>();
//
//        for (String s : myString.split("x")) {
//            answer.add(s.length());
//        }
//        //if (myString.lastIndexOf("x") == myString.length() - 1) {
//        if (myString.endsWith("x")) {
//            answer.add(0);
//        }
//
//        return answer.stream().mapToInt(i -> i).toArray();
//
         return Arrays.stream(myString.split("x", myString.length()))
             .mapToInt(x -> x.length())
             .toArray();
    }

    public static void main(String[] args) {
        String myString1 = "oxooxoxxox";
        String myString2 = "xabcxdefxghi";
        System.out.println(Arrays.toString(solution(myString1)));
        System.out.println(Arrays.toString(solution(myString2)));
    }
}
