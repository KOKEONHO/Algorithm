package baekjoon.silver.level_3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x1, y1, r1, x2, y2, r2;
        int absoluteX, absoluteY;
        double pointDistance;
        int totalR;

        int testCase = Integer.parseInt(br.readLine());
        String userInput = "";
        StringTokenizer stringTokenizer;

        for (int i = 0; i < testCase; i++) {
            userInput = br.readLine();
            stringTokenizer = new StringTokenizer(userInput);
            x1 = Integer.parseInt(stringTokenizer.nextToken());
            y1 = Integer.parseInt(stringTokenizer.nextToken());
            r1 = Integer.parseInt(stringTokenizer.nextToken());
            x2 = Integer.parseInt(stringTokenizer.nextToken());
            y2 = Integer.parseInt(stringTokenizer.nextToken());
            r2 = Integer.parseInt(stringTokenizer.nextToken());

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) {
                    bw.write("-1");
                    bw.newLine();
                    continue;
                }
                bw.write("0");
                bw.newLine();
                continue;
            }

            absoluteX = Math.abs(x1 - x2);
            absoluteY = Math.abs(y1 - y2);
            pointDistance = Math.sqrt(absoluteX * absoluteX + absoluteY * absoluteY);
            totalR = r1 + r2;

            if (pointDistance > totalR) {
                bw.write("0");
                bw.newLine();
                continue;
            }
            if (pointDistance < totalR) {
                bw.write("2");
                bw.newLine();
                continue;
            }
            if (pointDistance == totalR) {
                bw.write("1");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
