package d3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public static void main(String[] args) {
        // "연결 되었다" 라는 정보를 담은 문자열 배열
        String[] edges = {
                "1 2", // 1과 2가 연결되어있다.
                "1 3",
                "2 4",
                "2 5",
                "3 7",
                "4 6",
                "5 6",
                "6 7"
        };

        // 총 점의 개수 : 7개의 노드를 가지고 있다.
        int nodeCount = 7;

        // 인접 행렬 : 각 점이 연결되었는지를 판단하기 위한 배열
        // int 형 배열은 전부 0으로 초기화가 된다.
        int[][] adjMap = new int[nodeCount + 1][nodeCount + 1];

        // 주어진 연결 정보를 바탕으로 adjMap 을 채워 넣는다. 연결되어있다면 1
        // 1. 주어진 선의 개수만큼 반복
        for (int i = 0; i < edges.length; i++) {
            // 2. 하나의 정보를 나누어서 출발 종점을 구분해 각각 변수에 할당
            String[] edgeInfo = edges[i].split(" ");
            int leftNode = Integer.parseInt(edgeInfo[0]);
            int rightNode = Integer.parseInt(edgeInfo[1]);

            // 3. 각각의 정점을 adjMap[left][right] = 1
            adjMap[leftNode][rightNode] = 1;
            adjMap[rightNode][leftNode] = 1;
        }
        // ---------------- 지도 완성 ----------------

        // 다음 방문할 곳을 기록하기 위한 스택 하나
        Stack<Integer> toVisit = new Stack<>();
        // 방문한 순서를 살펴보기 위한 리스트 하나
        List<Integer> visitOrder = new ArrayList<>();
        // 내가 방문 했는지를 파악하기 위한 배열 하나
        boolean[] visited = new boolean[nodeCount + 1];

        // ---------------- 준비 과정 끝, DFS 시작 ----------------
        // 1. 가장 먼저 방문할 곳(시작지점)을 넣어둔다.
        toVisit.push(1);
        // 2. 스택이 빌떄까지(더이상 방문할 곳이 없을떄까지) 반복한다
        while (!toVisit.empty()) {
            // 3. 다음 방문할 곳을 pop 한다 (pop 해서 가져온다 = 방문을 한다.)
            int next = toVisit.pop();
            // 4. 방문 했는지를 visited 를 바탕으로 파악하여
            //    - 만약 방문 했다면 다음 곳(반복)으로 넘어간다.
            if(visited[next]) continue;
            //    - 미방문이면 이제 표시한다.
            visited[next] = true;

            // 5. 방문 순서를 기록해준다.
            visitOrder.add(next);

            // 6. 다음 방문 대상을 스택에 push 한다.
            for (int i = nodeCount; i > 0; i--) {
                // 만약 방문했다면 (visited[i]) 추가하지 않고,
                if (visited[i]) continue;
                // 도달할 수 있다면 추가한다.
                if (adjMap[next][i] == 1) {
                    toVisit.push(i);
                }
            }
        }
        // 방문 순서 학인
        System.out.println(visitOrder);
    }
}

