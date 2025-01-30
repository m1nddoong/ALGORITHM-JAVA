package programmers.basic;

// A 강조하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181874
public class Solution181874 {
    public static String solution(String myString) {
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : myString.toCharArray()) {
//            if (c == 'a') {
//                sb.append('A');
//            }
//            else if (c > 65 && c < 97) {
//                sb.append((char) ((int) c + 32));
//            }
//            else {
//                sb.append(c);
//            }
//        }
//
//        return sb.toString();

        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');
        return myString;
    }

    public static void main(String[] args) {
        String myString1 = "abstract algebra";
        System.out.println(solution(myString1));
        String myString2 = "PrOgRaMmErS";
        System.out.println(solution(myString2));
    }
}
