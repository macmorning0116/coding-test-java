package BaekJoon;

import java.util.*;

public class Baek_1260_인접리스트 {
    static int N,M, V; // 정점개수, 간선개수, 시작정점
    static LinkedList<Integer>[] adjList;
    static boolean[] visit; // 정점의 재방문 방지하기 위한 방문체크
    static StringBuilder sb; // DFS 탐색시 재귀 함수에서 방문처리 해야해서 스트링 이어붙일 때 메소드 밖에 있어야 편할 수 있다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        adjList = new LinkedList[N + 1]; // 링크드 리스트가 모든 정점마다 각자 가지도록

        for (int i = 1; i < N; i++) {
            adjList[i] = new LinkedList<>(); // 모든 정점들이 일단 비어있는 리스트 객체를 하나씩 가지도록
        }


        for (int i = 0; i < M; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        for (int i = 1; i < N; i++) { // 모든 정점들이 자기 친구 찾을 때 숫자 작은 친구부터 찾아야 하는데 입력순서는 보장되지 않음
            Collections.sort(adjList[i]); // 모든 정애들이 자기 친구 정보를 오름차순 정렬해서 유지하도록!
        }

        visit = new boolean[N + 1];
        sb = new StringBuilder();





    }

    public static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start); // queue가 곧 방문 스케쥴
        visit[start] = true;  // bfs는 일단 스케쥴 순서대로 무조건 방문 하니까 스케쥴 잡은 정점은 이미 큐에 먼저 들어갔다고 표시하기

        while (!queue.isEmpty()) {
            int now = queue.poll(); // 현재 방문처리하는 정점
            sb.append(now + " ");

            for (int next : adjList[now]) {
                if (!visit[next]) {
                    queue.add(next);
                    visit[next] = true;
                }
            }
        }

    }


    public static void dfs(int now) {
        visit[now] = true;
        sb.append(now + " ");

        // 근데 여기서 adj[now][2] 이런식으로 했을때 이게 null 이여도 npe 가 안뜨는건가?
        for (int next : adjList[now]) {
            dfs(next);
        }
    }




}
