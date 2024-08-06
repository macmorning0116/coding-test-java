import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon1920 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arrN = new String[N];
        for (int i = 0; i < N; i++) {   // 기존에 spilt()에서 .next() 로 방식변경
            arrN[i] = sc.next();
        }

        int M = sc.nextInt();
        String[] arrM = new String[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = sc.next();
        }

        for (String s : arrN) {
            map.put(s, 1);
        }

        StringBuilder sb = new StringBuilder(); // 기존의 sout()에서 StringBuilder 로 변경
        for (String s : arrM) {
            sb.append(map.containsKey(s) ? "1" : "0").append("\n");
        }

        System.out.print(sb.toString());
    }
}
