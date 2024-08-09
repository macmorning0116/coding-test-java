package BaekJoon;

class Solution {
    public long solution(int r1, int r2) {
        int zeroLine = r2 - r1 + 1;
        int spaceDot = 0;

        for (int i = 1; i <= r2 - 1; i++) {
            double temp = Math.sqrt(2 * Math.pow(i, 2));
            if (r1 <= temp && temp <= r2) {
                spaceDot += 2 * i - 1;
            } else if (temp > r2) {
                spaceDot += i + 1;
            }
        }

        System.out.println("zeroLine " + zeroLine);
        System.out.println("spaceDot " + spaceDot);

        return 4 * zeroLine + 4 * spaceDot;
    }
}
