import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baek10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String temp = st.nextToken();
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            }else{
                map.put(temp, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String temp = "0";
            String next = st2.nextToken();
            if (map.containsKey(next)) {
                temp = String.valueOf(map.get(next));
            }

            sb.append(temp).append(" ");
        }

        System.out.println(sb);
    }
}
