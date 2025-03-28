package BOJ.classification.N05_깊이우선탐색;

import java.io.*;
import java.util.*;

// [실버 2] DFS와 BFS : https://www.acmicpc.net/problem/1260
public class Main1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int N = Integer.parseInt(input.split(" ")[0]); // 정점의 개수 : 4
        int M = Integer.parseInt(input.split(" ")[1]); // 간선의 개수 : 5
        int V = Integer.parseInt(input.split(" ")[2]); // 탐색을 시작할 정점의 번호 : 1
        int[][] adj = new int[N + 1][N + 1]; // 인접 리스트

        for (int i = 0; i < M; i++) {
            String edgeInput = br.readLine();

            int x = Integer.parseInt(edgeInput.split(" ")[0]);
            int y = Integer.parseInt(edgeInput.split(" ")[1]);
            adj[x][y] = adj[y][x] = 1;
        }

        StringBuilder sb = new StringBuilder();
        int[] dfsResult = dfs(N, M, V, adj);
        int[] bfsResult = bfs(N, M, V, adj);


        for (int i = 0; i < dfsResult.length; i++) {
            sb.append(dfsResult[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < dfsResult.length; i++) {
            sb.append(bfsResult[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static int[] dfs(int N, int M, int V, int[][] adj) {
        Deque<Integer> toVisit = new ArrayDeque<>(); // 스택 (방문 노드)
        List<Integer> visitOrder = new ArrayList<>(); // 벙문 순서
        boolean[] visited = new boolean[N + 1]; // 방문 했는지

        toVisit.push(V);
        while (!toVisit.isEmpty()) {
            int next = toVisit.pop(); // 방문!
            if (visited[next]) continue;

            visited[next] = true;
            visitOrder.add(next); // 방문했으니까 추가

            // 현재 방문한 노드와 간선으로 연결되어있고, 방문 안한곳은 스택이 push
            // 큰 숫자부터 넣어야 작은 숫자가 먼저 방문됨
            for (int i = N; i >= 1; i--) {
                if (adj[next][i] == 1 && !visited[i]) {
                    toVisit.push(i);
                }
            }
        }
        return visitOrder.stream().mapToInt(i -> i).toArray();
    }

    public static int[] bfs(int N, int M, int V, int[][] adj) {
        Deque<Integer> toVisit = new ArrayDeque<>(); // 큐
        List<Integer> visitOrder = new ArrayList<>(); // 벙문 순서
        boolean[] visited = new boolean[N + 1]; // 방문 했는지

        toVisit.offer(V);
        while (!toVisit.isEmpty()) {
            int next = toVisit.poll(); // 방문!
            if (visited[next]) continue;

            visited[next] = true;
            visitOrder.add(next); // 방문했으니까 추가

            // 현재 방문한 노드와 간선으로 연결되어있고, 방문 안한곳은 스택이 push
            // 큰 숫자부터 넣어야 작은 숫자가 먼저 방문됨
            for (int i = 1; i <= N; i++) {
                if (adj[next][i] == 1 && !visited[i]) {
                    toVisit.offer(i);
                }
            }
        }
        return visitOrder.stream().mapToInt(i -> i).toArray();
    }
}

