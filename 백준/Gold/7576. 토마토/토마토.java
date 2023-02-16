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
	static Queue<Integer> queI= new LinkedList<Integer>();
	static Queue<Integer> queJ= new LinkedList<Integer>();
	static int cnt =1;
	static int[] dx= {1,0,-1,0};
	static int[] dy= {0,1,0,-1};
	static int zero;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		box = new int[M][N];
	//	visit = new boolean[M][N];
		zero=N*M;
		for(int i=0; i<M; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				box[i][j]= Integer.parseInt(st.nextToken());
				if(box[i][j]==1){
					queI.add(i);
					queJ.add(j);
				} 
				if(box[i][j]!=0) {
					zero--;
				}
			}
		}
		fnc();
	}
	
	public static void fnc() {

		while(queI.size()!=0) {
			int i = queI.poll();
			int j = queJ.poll();
			
			for(int d=0; d<4; d++) {
				int nx = dx[d]+i;
				int ny = dy[d]+j;
				if(nx>=0 && nx<M && ny>=0 && ny<N && box[nx][ny]==0) {
					box[nx][ny]=box[i][j]+1;
					queI.add(nx);
					queJ.add(ny);
					cnt= Math.max(cnt, box[nx][ny]);
					zero--;
				}
				
			}
		}
		if(zero != 0) {
			System.out.println(-1);
		}else {
			System.out.println(cnt-1);
		}
		
	}


}