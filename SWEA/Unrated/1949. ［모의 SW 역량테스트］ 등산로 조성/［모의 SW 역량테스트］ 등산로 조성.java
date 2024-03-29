import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int N;
	static int K;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int ans;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		//테스트 케이스 반복
		for(int testCase = 1; testCase <= T; testCase++) {
			ans=0;
			//땅을 팔 수 있는 높이 K와 맵의 크기 N
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			map = new int[N][N];
			
			//맵 입력 받으며 최대 높이 찾기
			int maxH=0;
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					maxH = Math.max(maxH, map[i][j]);
				}
			}
			

			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j]==maxH) {
						visited = new boolean[N][N];				
						dfs(i, j,  true, 1);
						
						
					}
				}
			}
			sb.append("#"+testCase+" "+ans+"\n");
			
		
			
		}
		System.out.println(sb);
		
		
	}
	
	static void dfs(int x, int y, boolean power, int depth) {
		if (depth > ans)ans = depth;

		int currH = map[x][y];
		
		visited[x][y]= true;
		for(int d=0; d<4; d++) {
			
			int nx = x + dx[d];
			int ny = y + dy[d];
		
			if(nx>=0 && nx<N && ny>=0 && ny<N && !visited[nx][ny]) {

				if(map[nx][ny]<currH){			
					dfs(nx, ny, power, depth+1);
				}else if(power && map[nx][ny]-K<currH &&!visited[nx][ny]){
					//산 깎은 부분 기억
					int tmp = map[nx][ny];
					map[nx][ny]= map[x][y]-1;
					dfs(nx, ny, false, depth+1);		
					map[nx][ny]= tmp;
				}
				
			}
			
		}
		visited[x][y]= false;
	}
}