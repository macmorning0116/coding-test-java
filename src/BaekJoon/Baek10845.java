package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList q = new LinkedList();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String inst = st.nextToken();

            if (inst.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                q.add(num);
            } else if (inst.equals("front")) {
                if (q.isEmpty()) {
                    System.out.println("-1");
                }else{
                    System.out.println(q.peekFirst());
                }
            } else if (inst.equals("back")) {
                if (q.isEmpty()) {
                    System.out.println("-1");
                }else{
                    System.out.println(q.peekLast());
                }
            } else if (inst.equals("size")) {
                System.out.println(q.size());
            } else if (inst.equals("pop")) {
                if (q.isEmpty()) {
                    System.out.println("-1");
                }else {
                    System.out.println(q.pollFirst());
                }
            } else{
                if (q.isEmpty()) {
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }
    }
}
