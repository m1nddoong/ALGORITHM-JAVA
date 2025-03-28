package BOJ.classification.N05_깊이우선탐색;

import java.util.*;

public class GraphTraversalExample {
    private int[][] adjMap;
    private int nodeCount;

    public GraphTraversalExample(int nodeCount, int[][] edges) {
        this.nodeCount = nodeCount;
        this.adjMap = new int[nodeCount + 1][nodeCount + 1];
        initializeGraph(edges);
    }

    private void initializeGraph(int[][] edges) {
        for (int[] edge : edges) {
            adjMap[edge[0]][edge[1]] = adjMap[edge[1]][edge[0]] = 1;
        }
    }

    public List<Integer> dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> visitOrder = new ArrayList<>();
        boolean[] visited = new boolean[nodeCount + 1];

        stack.push(start);

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (visited[current]) continue;

            visited[current] = true;
            visitOrder.add(current);

            for (int i = nodeCount; i >= 1; i--) {
                if (adjMap[current][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }
        }

        return visitOrder;
    }

    public List<Integer> bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visitOrder = new ArrayList<>();
        boolean[] visited = new boolean[nodeCount + 1];

        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (visited[current]) continue;

            visited[current] = true;
            visitOrder.add(current);

            for (int i = 1; i <= nodeCount; i++) {
                if (adjMap[current][i] == 1 && !visited[i]) {
                    queue.offer(i);
                }
            }
        }

        return visitOrder;
    }

    public static void main(String[] args) {
        int[][] edges = {
                {1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 7}, {4, 6}, {5, 6}, {6, 7}
        };
        int N = 7;

        GraphTraversalExample graph = new GraphTraversalExample(N, edges);

        System.out.println("DFS: " + graph.dfs(1));
        System.out.println("BFS: " + graph.bfs(1));
    }
}
