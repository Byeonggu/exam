import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static boolean[][] visit;
	static Queue<Integer> qu = new LinkedList<Integer>();
	static int N;
	static int T;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int max = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map = new int[N][T];
		visit = new boolean[N][T];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < T; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);

		System.out.println(max);

	}

	private static void dfs(int deepth) {
		if (deepth == 3) {
			check();

			return;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < T; j++) {
				if (map[i][j] == 0 && !visit[i][j]) {

					visit[i][j] = true;
					map[i][j] = 1;
					dfs(deepth + 1);
					map[i][j] = 0;
					visit[i][j] = false;
				}
			}
		}
	}

	private static void check() {
		// TODO Auto-generated method stub
		int[][] clone = new int[N][T];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < T; j++) {
				clone[i][j] = map[i][j];
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < T; j++) {
				if (clone[i][j] == 2) {
					qu.add(i);
					qu.add(j);
				}
			}
		}
		while (qu.size() != 0) {
			int x = qu.poll();
			int y = qu.poll();
			for (int d = 0; d < dx.length; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (nx >= 0 && nx < N && ny >= 0 && ny < T && clone[nx][ny] == 0) {
					clone[nx][ny] = 2;
					qu.add(nx);
					qu.add(ny);
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < T; j++) {
				if (clone[i][j] == 0) {
					cnt++;
				}
			}
		}
		max = Math.max(cnt, max);

		return;

	}

}