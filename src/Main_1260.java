import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260 {
    static int N,M, V; // 정점개수, 간선개수, 시작정점
    static boolean[][] adj; // 정점간의 인접 여부
    static boolean[] visit; // 정점의 재방문 방지하기 위한 방문체크
    static StringBuilder sb; // DFS 탐색시 재귀 함수에서 방문처리 해야해서 스트링 이어붙일 때 메소드 밖에 있어야 편할 수 있다.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        adj = new boolean[N + 1][N + 1]; // 정점 번호가 1~N 까지 사용

        for (int i = 0; i < M; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adj[v1][v2] = true;
            adj[v2][v1] = true;
        }

        visit = new boolean[N + 1]; // 1~ N번까지 정점이 방문했는지 아닌지
        sb = new StringBuilder(); // 방문 할때마다 여기 기록

//        dfs(V);
//
//        System.out.println(sb.toString());

        // bfs 탐색 출발을 위해 리셋
        visit = new boolean[N + 1]; // 1~ N번까지 정점이 방문했는지 아닌지
        sb = new StringBuilder(); // 방문 할때마다 여기 기록

        bfs(V);
        System.out.println(sb.toString());
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start); // queue가 곧 방문 스케쥴
        visit[start] = true;  // bfs는 일단 스케쥴 순서대로 무조건 방문 하니까 스케쥴 잡은 정점은 이미 큐에 먼저 들어갔다고 표시하기

        while (!queue.isEmpty()) {
            int now = queue.poll(); // 현재 방문처리하는 정점
            sb.append(now + " ");

            for (int next = 1; next <= N; next++) {
                if (adj[now][next] && !visit[next]) {
                    visit[next] = true;
                }
            }


        }

    }




    public static void dfs(int now) {
        visit[now] = true;
        sb.append(now + " ");

        // 근데 여기서 adj[now][2] 이런식으로 했을때 이게 null 이여도 npe 가 안뜨는건가?
        for (int next = 0; next <= N; next++) {
            if (adj[now][next] && !visit[next]) { // 현재 정점에서 인접한 다른 정점이 있어? 그럼 일단 기다려
                dfs(next);
            }
        }
    }
}
