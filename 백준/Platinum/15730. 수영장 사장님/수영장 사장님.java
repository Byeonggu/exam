
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] map;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		PriorityQueue<Node> pq = new PriorityQueue<>((e1, e2) -> e1.value - e2.value);
		for (int r = 0; r < n; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < m; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
				if (r == 0 || c == 0 || r == n-1 || c == m-1) {
					visited[r][c] = true;
					pq.offer(new Node(r, c, map[r][c]));
				}
			}
		}
		
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		int ans = 0;
		
		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int r =node.x , c = node.y;
			for (int i = 0; i < 4; i++) {
				int nx = r + dr[i];
				int ny = c + dc[i];
				if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny]) {
					continue;
				}
				
				visited[nx][ny] = true;
				if (node.value > map[nx][ny]) {
					ans += (node.value-map[nx][ny]);
				}
				pq.offer(new Node(nx, ny, Math.max(map[nx][ny], node.value)));
			}
		}
		System.out.println(ans);
	}
	
	static class Node{
		int x;
		int y;
		int value;
		public Node(int x, int y, int value) {
			super();
			this.x = x;
			this.y = y;
			this.value = value;
		}
		
	}
}