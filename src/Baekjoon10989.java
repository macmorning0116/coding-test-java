import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001]; // 10000보다 작은 숫자를 저장할 배열

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++; // 입력된 숫자에 해당하는 인덱스값 +1
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (count[i] > 0) {
                sb.append(i).append('\n');
            }

        }

        System.out.print(sb.toString());
    }
}