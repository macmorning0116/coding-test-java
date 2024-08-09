package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1026 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrB[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arrA);

        boolean[] visit = new boolean[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int maxTemp = -1;
            int idxTemp = 0;
            for (int j = 0; j < n; j++) {
                if (!visit[j] & arrB[j] > maxTemp) {
                    maxTemp = arrB[j];
                    idxTemp = j;
                }
            }
            visit[idxTemp] = true;
            result[idxTemp] = arrA[i];
        }

        for (int i = 0; i < n; i++) {
            answer += result[i] * arrB[i];
        }

//        System.out.println(Arrays.toString(result));
        System.out.println(answer);
    }
}
