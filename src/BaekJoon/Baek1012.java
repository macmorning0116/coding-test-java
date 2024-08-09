package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1012 {
    static int[][] arr;
    static boolean[][] visit;
    static int[] di = {0, 0, -1, 1};
    static int[] dj = {1, -1, 0, 0};
    static int m;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int result = 0;

            arr = new int[n][m];
            visit = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st2.nextToken());
                int y = Integer.parseInt(st2.nextToken());

                arr[y][x] = 1;
            }

            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (arr[j][l] == 1 & visit[j][l] == false) {
                        visit[j][l] = true;
                        result += 1;
                        dfs(j, l);
                    }
                }
            }

            System.out.println(result);


        }
    }

    public static void dfs(int i, int j) {
        for (int k = 0; k < 4; k++) {
            int ni = i + di[k];
            int nj = j + dj[k];

            if ((0 <= ni && ni < n) & (0 <= nj && nj < m) && arr[ni][nj] == 1 && !visit[ni][nj]) {
                visit[ni][nj] = true;
                dfs(ni, nj);
            }

        }
    }
}
