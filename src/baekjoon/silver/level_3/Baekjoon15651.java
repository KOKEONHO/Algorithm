package baekjoon.silver.level_3;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15651 {

    private static int N, M;
    private static int[] array;
    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        array = new int[M];

        dfs(0);

        bw.write(stringBuilder.toString());
        bw.newLine();

        bw.flush();
        bw.close();
    }

    private static void dfs(int depth) {

        if (depth == M) {
            for (int i = 0; i < array.length; i++) {
                stringBuilder.append(array[i] + " ");
            }
            stringBuilder.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            array[depth] = i + 1;
            dfs(depth + 1);
        }
    }
}
