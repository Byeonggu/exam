import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[H][W];
		boolean[][][] visited = new boolean[H][W][2];
		for(int i=0; i<H; i++) {
			String[] str = br.readLine().split("");
			for(int j=0; j<W; j++) {
				map[i][j]= Integer.parseInt(str[j]);
			}
		}
		
		int[] mx = {0, -1, 0, 1};
		int[] my = {1, 0, -1, 0};
		int[] hx = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] hy = {1, 2, 2, 1, -1, -2, -2, -1};
		
		Queue<Node> qu = new LinkedList<>();
		Node m1= new Node(0, 0, 1, 1);
		visited[0][0][1]= true;
		qu.add(m1);
		int ans =Integer.MAX_VALUE;
		while(!qu.isEmpty()) {
			Node mk2= qu.poll();
			int x =mk2.x;
			int y= mk2.y;
			int power = mk2.power;
			int time = mk2.time;
//			visited[x][y][power]=true;
			//잘 도착했는 지 확인해줘
			if(x == H-1 && y ==W-1) {
				ans= Math.min(time, ans);
				break;
			}
			for(int i=0; i<4; i++) {
				int nx = x+mx[i];
				int ny = y+my[i];
				if(nx>=0 && nx<H && ny>=0 && ny<W&& !visited[nx][ny][power]  && map[nx][ny]==0) {
					visited[nx][ny][power]=true;
					Node mk3= new Node(nx, ny, power, time+1);
					qu.add(mk3);
				}
			}

			if(power>0){
				//파워하나까고 말따라하기 + 안까고 그냥움직임
				//말움직임-파워하나까고
				for(int i=0; i<4; i++) {
					int nx = x+mx[i];
					int ny = y+my[i];
					if(nx>=0 && nx<H && ny>=0 && ny<W&& !visited[nx][ny][power-1]  && map[nx][ny]==1) {
						visited[nx][ny][power-1]=true;
						Node mk3= new Node(nx, ny, power-1, time+1);
						qu.add(mk3);
					}
				}
				//안까고 그냥 움직임
				
			}
			
		}
		if(ans==Integer.MAX_VALUE)ans =-1;
		System.out.println(ans);
		
		
	}
	
	static class Node{
		int x;
		int y;
		int power;
		int time;
		public Node(int x, int y, int power, int time) {
			this.x = x;
			this.y = y;
			this.power = power;
			this.time = time;
		}
	}
}