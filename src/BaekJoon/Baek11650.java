package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Coordinate[] arr = new Coordinate[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i] = new Coordinate(x, y);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (Coordinate coordinate : arr) {
            sb.append(coordinate.getX() + " " + coordinate.getY()).append("\n");
        }

        System.out.println(sb);
    }

    static class Coordinate implements Comparable<Coordinate>{
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int compareTo(Coordinate o) {
            if (o.getX() == this.getX()) {
                return Integer.compare(this.getY(), o.getY());
            }else{
                return Integer.compare(this.getX(), o.getX());
            }

        }
    }
}
