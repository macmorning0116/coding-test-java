package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek4936 {
    static int[][] arr;
    static int n;
    static int m;
    static boolean[][] visit;
    static int[] di = {0, 0, 1, -1, -1, -1, 1, 1};
    static int[] dj = {-1, 1, 0, 0, 1, -1, 1, -1};



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            arr = new int[n][m];
            visit = new boolean[n][m];
            int result = 0;

            if (n == 0) {
                return;
            }
            // arr 배열에 채우기
            for (int i = 0; i < n; i++) {
                StringTokenizer nums = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(nums.nextToken());
                }
            }

            // arr 배열을 순회하면서
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1 && !visit[i][j]) {
                        visit[i][j] = true;
                        result += 1;
                        dfs(i, j);
                    }
                }
            }

            System.out.println(result);


        }

    }

    public static void dfs(int i, int j) {
        for (int k = 0; k < 8; k++) {
            int ni = i + di[k];
            int nj = j + dj[k];

            if (0 <= ni && ni < n && 0 <= nj && nj < m && arr[ni][nj] == 1 && !visit[ni][nj]) {
                visit[ni][nj] = true;
                dfs(ni, nj);
            }
        }
    }
}
