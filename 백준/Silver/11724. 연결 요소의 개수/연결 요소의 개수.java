import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[][] graph;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		graph = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		int a;
		int b;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			a= Integer.parseInt(st.nextToken());
			b= Integer.parseInt(st.nextToken());
			graph[a][b]=1;
			graph[b][a]=1;
		}
		
		int cnt =0;
		for(int i=1; i<N+1; i++) {
			if(visit[i] == false) { // 방문한 적 없는 노드라면 dfs.
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	private static void dfs(int idx) {
		// TODO Auto-generated method stub
		if(visit[idx] == true)
			return;
		else {
			visit[idx] = true;
			for(int i = 1; i <= N; i++) {
				if(graph[idx][i] == 1) {
					dfs(i);
				}
			}
		}
	}
}