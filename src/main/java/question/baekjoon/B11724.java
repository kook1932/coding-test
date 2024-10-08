package question.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B11724 {

	private static List<Integer>[] graph;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int nodeCount = Integer.parseInt(st.nextToken());
		int edges = Integer.parseInt(st.nextToken());

		// 인접리스트
		graph = new ArrayList[nodeCount + 1];
		for (int i = 1; i <= nodeCount; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < edges; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			graph[start].add(end);
			graph[end].add(start);
		}

		// 방문리스트
		visited = new boolean[nodeCount + 1];

		int count = 0;
		for (int i = 1; i <= nodeCount; i++) {
			if (!visited[i]) {
				count++;
			}
			DFS(i);
		}

		System.out.println(count);
	}

	private static void DFS(int v) {
		if (visited[v]) {
			return;
		} else {
			visited[v] = true;
		}
		for (Integer i : graph[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
}
