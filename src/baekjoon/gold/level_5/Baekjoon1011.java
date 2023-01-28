package baekjoon.gold.level_5;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1011 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x, y, distance, result;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer;

        for (int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            distance = y - x;
            result = solution(distance);
            bw.write(Integer.toString(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static int solution(int distance) {
        long x = 0;
        int step = 2;
        while (true) {
            x += step;
            if (x >= distance) {
                if (distance > x - (step / 2)) {
                    return step;
                }
                return step - 1;
            }
            step += 2;
        }
    }
}
