import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static String[][] map;
	static int[][] cnt;
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		map = new String[N][M];
		
		for(int i=0; i<N; i++) {
			String str= br.readLine();
			map[i]=str.split("");
		}
		
		int max =0;
		int[] dx= {-1, 1, 0, 0};
		int[] dy= {0, 0, 1, -1};
		
		Queue<Integer> qu = new LinkedList<Integer>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				cnt = new int[N][M];
				if(map[i][j].equals("L")) {
					qu.add(i);
					qu.add(j);
					cnt[i][j]=1;
					while(!qu.isEmpty()) {
						int x = qu.poll();
						int y = qu.poll();
						for(int d=0; d<4; d++) {
							int nx=x+dx[d];
							int ny=y+dy[d];
							if(nx>=0 && nx<N &&ny>=0 && ny<M &&map[nx][ny].equals("L")&&cnt[nx][ny]==0) {
								cnt[nx][ny]= cnt[x][y]+1;
								max=Math.max(max, cnt[nx][ny]);
								qu.offer(nx);
								qu.offer(ny);
							}
							
						}
					}
				}
			}
		}
		System.out.println(max-1);
		
	}
    
}