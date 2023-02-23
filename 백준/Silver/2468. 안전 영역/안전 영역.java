import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] map;
	static boolean[][] visit;
	static int N;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int dfs(int x, int y, int h) {
		visit[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1)
				continue;
			if (visit[nx][ny])
				continue;
			if (map[nx][ny] > h) {
				dfs(nx, ny, h);
			}
		}
		return 1;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		int num = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] > num) {
					num = map[i][j];
				}
			}
		}

		int max = 0;
		for (int height = 0; height < num + 1; height++) {
			visit = new boolean[N][N];
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visit[i][j] && map[i][j] > height) {
						cnt += dfs(i, j, height);
					}
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}

	
}