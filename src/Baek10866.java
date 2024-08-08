import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque deque = new LinkedList();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String inst = st.nextToken();

            if (inst.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            } else if (inst.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            }else if (inst.equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                }else{
                    System.out.println(deque.peekFirst());
                }
            } else if (inst.equals("back")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                }else {
                    System.out.println(deque.peekLast());
                }
            } else if (inst.equals("pop_front")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                }else{
                    System.out.println(deque.pollFirst());
                }
            }else if (inst.equals("pop_back")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                }else{
                    System.out.println(deque.pollLast());
                }
            }else if (inst.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else{
                System.out.println(deque.size());
            }
        }

    }
}
