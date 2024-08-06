import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Baek11111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        List<String> list = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());
        for (String s : list) {
            map.put(s, 1);
        }

        int M = Integer.parseInt(br.readLine());
        List<String> list2 = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (String s : list2) {
            if (map.containsKey(s)) {
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

    }
}
