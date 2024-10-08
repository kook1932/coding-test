package question.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178 {

	private static int[] dx = {0, 1, 0, -1};
	private static int[] dy = {-1, 0, 1, 0};
	private static int[][] ways;
	private static boolean[][] visited;
	private static int n;
	private static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		ways = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				ways[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}

		BFS(0, 0);
		System.out.println(ways[n - 1][m - 1]);
	}

	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{i, j});
		visited[i][j] = true;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			for (int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if (x >= 0 && y >= 0 && x < n && y < m) {
					if (ways[x][y] == 1 && !visited[x][y]) {
						queue.offer(new int[]{x, y});
						ways[x][y] = ways[now[0]][now[1]] + 1;
					}
				}
			}
		}
	}

}
