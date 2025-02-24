package programmers.알고리즘_고득점_Kit.N03_힙;

import java.util.PriorityQueue;

// 더 맵게 : https://school.programmers.co.kr/learn/courses/30/lessons/42626
public class Solution42626 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int v : scoville) {
            pq.offer(v);
        }

        while (pq.size() > 1 && pq.peek() < K) {
            pq.offer(pq.remove() + pq.remove() * 2);
            answer++;
        }

        return pq.peek() >= K ? answer : -1;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }
}
