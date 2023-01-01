package baekjoon.silver.level_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Ssibal {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int computerCount = Integer.parseInt(br.readLine());
        int pairCount = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[computerCount + 1];
        ArrayList<Integer>[] graph = new ArrayList[computerCount + 1];
        String pairString = "";

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < pairCount; i++) {
            pairString = br.readLine();
            graph[Character.getNumericValue(pairString.charAt(0))].add(Character.getNumericValue(pairString.charAt(2)));
            graph[Character.getNumericValue(pairString.charAt(2))].add(Character.getNumericValue(pairString.charAt(0)));
        }

        bw.write(Arrays.toString(graph));
        bw.newLine();

        int count = 0;

        int result = dfs(1, graph, visited, count);

        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
    }

    public static int dfs(int nodeIndex, ArrayList<Integer>[] graph, boolean[] visited, int count) {

        visited[nodeIndex] = true;
        int result = 0;

        for (int i = 0; i < graph[nodeIndex].size(); i++) {
            if (!visited[graph[nodeIndex].get(i)]) {
                System.out.print(graph[nodeIndex].get(i) + " -> ");
                count++;
                result = dfs(graph[nodeIndex].get(i), graph, visited, count);
            }
        }

        if (result >= count) {
            return result;
        }
        return count;
    }
}
