package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String instruction = st.nextToken();
            if (instruction.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else if (instruction.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                }else{
                    System.out.println(stack.peek());
                }
            } else if (instruction.equals("size")) {
                System.out.println(stack.size());
            } else if (instruction.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            } else if (instruction.equals("pop")) {
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.pop());
                }
            }
        }
    }
}

