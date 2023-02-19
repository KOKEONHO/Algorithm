package baekjoon.silver.level_3;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15649 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] array = new int[M];
        boolean[] visited = new boolean[N];
        permutation(0, array, visited, bw);

        bw.flush();
        bw.close();
    }

    private static void permutation(int count, int[] array, boolean[] visited, BufferedWriter bw) throws IOException{

        if (count == array.length) {
            for (int i = 0; i < array.length; i++) {
                bw.write(array[i]+" ");
            }
            bw.newLine();
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i]=true;
                array[count] = i + 1;
                permutation(count + 1, array, visited, bw);
                visited[i] = false;
            }
        }
    }
}
