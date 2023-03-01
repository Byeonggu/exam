import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static int[][] map;
	
	static int N;
	static int M;
	static int[] dx= {-1, 0, 1, 0};
	static int[] dy= {0, 1, 0, -1};
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String input = br.readLine();
			for(int j= 0; j<M; j++){
				map[i][j]= input.charAt(j)-'0';
			}
		}
		
		
		bfs();
		
		System.out.println(result);
		
		
	}
	
	public static void bfs(){
		Queue<Node> qu = new LinkedList<Node>();
		Node node1 = new Node(0, 0);
		qu.add(node1);
		
		
		while(!qu.isEmpty()) {
			Node node = qu.poll();
			int x = node.x;
			int y = node.y;
			
			
			if(x==N-1 && y==M-1) {
				result= map[x][y];
				break;
			}
			
			map[x][y]+=1;
			for(int i=0; i<4; i++) {
				 int nx = x+ dx[i];
				 int ny = y+ dy[i];
				 if(nx>=0 && nx<N && ny>=0 && ny<M && map[nx][ny]==1){
					map[nx][ny]=map[x][y];
					Node newNode = new Node(nx, ny);
					qu.add(newNode);
				 }
			 }
		}
	}
	
	public static class Node{
		public int x;
		public int y;
		
		
		public Node(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x=x;
			this.y=y;
		}
	}
}