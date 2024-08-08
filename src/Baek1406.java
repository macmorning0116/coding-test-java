import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek1406 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Stack<String> lStack = new Stack();
        Stack<String> rStack = new Stack();

        for (char c : input.toCharArray()) { // lStack에 다 넣어놈
            lStack.push(String.valueOf(c));
        }

        for (int i = 0; i < n; i++) {  // 명령어 처리
            StringTokenizer st = new StringTokenizer(br.readLine());
            String inst = st.nextToken();
            if (inst.equals("P")) {
                String str = st.nextToken();
                lStack.push(str);
            } else if (inst.equals("L")) {
                if (!lStack.isEmpty()) {
                    rStack.push(lStack.pop());
                }
            } else if (inst.equals("D")) {
                if (!rStack.isEmpty()) {
                    lStack.push(rStack.pop());
                }
            } else{
                if (!lStack.isEmpty()) {
                    lStack.pop();
                }
            }


        }
        // lStack -> rStack으로 옮김
        while (!lStack.isEmpty()) {
            rStack.push(lStack.pop());
        }

        // rStack에 들어있는 순서 역순 append
        StringBuilder sb = new StringBuilder();
        while (!rStack.isEmpty()) {
            sb.append(rStack.pop());
        }


        System.out.println(sb.toString());
    }
}

