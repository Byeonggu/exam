import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[][] box;
	static boolean[][] visit;
	
	//static Queue<Integer> queJ= new LinkedList<Integer>();
	static int cnt =0;
	static int[] dx= {1,0,-1,0};
	static int[] dy= {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc<T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K= Integer.parseInt(st.nextToken());
			box = new int[M][N];
			visit = new boolean[M][N];
		//	zero=N*M;
			for(int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				box[x][y]= 1;
			}
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(box[i][j]==1&&!visit[i][j]) {
						
						
						fnc(i,j);
						cnt++;
					}
				}
			}
			
			sb.append(cnt+"\n");
			cnt=0;

		}
		System.out.println(sb);
	}
	
	public static void fnc(int a, int b) {
		 Queue<int[]> queI= new LinkedList<int[]>();
		 queI.add(new int[] {a, b});
		 
		 while(!queI.isEmpty()) {
			
			int i = queI.peek()[0];
			int j = queI.peek()[1];
			queI.poll();
			
			visit[i][j]=true;
			for(int d=0; d<4; d++) {
				int nx = dx[d]+i;
				int ny = dy[d]+j;
				if(nx>=0 && nx<M && ny>=0 && ny<N && box[nx][ny]==1 &&!visit[nx][ny]) {
					queI.add(new int[] {nx, ny});
					visit[nx][ny]=true;
				}
				
			}
		}
		
		
	}


}