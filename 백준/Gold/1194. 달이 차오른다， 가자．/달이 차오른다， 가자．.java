import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[][] map = new String[N][M];
		boolean[][][][][][][][] visited = new boolean[N][M][2][2][2][2][2][2];
		Node start = null;
		int[] key= new int[6];
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split("");
			for(int j=0; j<M; j++) {
				map[i][j]= str[j];
				if(map[i][j].equals("0")) {
					start= new Node(i, j, key, 0, 0);
					map[i][j]=".";
				}
				
			}
		}
		
		int[] dx= {0,-1,0, 1, 0};
		int[] dy= {0, 0, -1, 0, 1};
		
		Queue<Node> stack = new LinkedList<>();
		stack.add(start);
		int ans=Integer.MAX_VALUE;
		while(!stack.isEmpty()) {
			boolean flag =false;
			
			Node tmp = stack.poll();
			int x= tmp.x;
			int y= tmp.y;
			int[] keys=tmp.key;
			int cnt=tmp.cnt;
			int dir=tmp.dir;
//			System.out.println(map[x][y]);
			if(map[x][y].equals("1")) {
				ans= Math.min(ans, cnt);
//				stack.poll();
				break;
			}	
			for(int i=1; i<=4; i++) {
				if(i!=dir) {
					int nx =x+dx[i];
					int ny =y+dy[i];
					
					if(nx>=0 && nx<N && ny>=0 && ny<M && !map[nx][ny].equals("#")
							&&!visited[nx][ny][keys[0]][keys[1]][keys[2]][keys[3]][keys[4]][keys[5]]) {
						
						String next = map[nx][ny];
						
						if(next.equals(".")) {
							visited[nx][ny][keys[0]][keys[1]][keys[2]][keys[3]][keys[4]][keys[5]]=true;
							stack.add(new Node(nx, ny, keys, cnt+1, dir));
						}else if(next.equals("1")) {
							visited[nx][ny][keys[0]][keys[1]][keys[2]][keys[3]][keys[4]][keys[5]]=true;
							stack.add(new Node(nx, ny, keys, cnt+1, dir));
						}else {
							if(doorOrKey(next)) {
								//열쇠일때
									int idx = meetA(next);
									int[] nextkeys = copy(keys);
									nextkeys[idx]=1;
									visited[nx][ny][nextkeys[0]][nextkeys[1]][nextkeys[2]][nextkeys[3]][nextkeys[4]][nextkeys[5]]=true;
									Node tmp1 = new Node(nx, ny, nextkeys, cnt+1, 0);
									stack.add(tmp1);
								flag=true;
							}else {
								//문일때
								int idx = meetB(next);
								if(keys[idx]>0) {
//									System.out.println(Arrays.toString(keys)+"/ "+ idx);
									visited[nx][ny][keys[0]][keys[1]][keys[2]][keys[3]][keys[4]][keys[5]]=true;
									stack.add(new Node(nx, ny, keys, cnt+1, dir));
									flag=true;
								}
							}
						}
					}
				}
				
			}
//			if(!flag)stack.poll();
			
			
		}
		if(ans==Integer.MAX_VALUE)ans =-1;
		System.out.println(ans);
		
		
	}
	
	static int[] copy(int[] arr) {
		int[] tmp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			tmp[i]= arr[i];
		}
		return tmp;
	}
	
	
	
	
	
	
	static boolean doorOrKey(String str) {
		
		if(str.equals("a")||str.equals("b")||str.equals("c")||str.equals("d")||str.equals("e")||str.equals("f")) {
			return true;
		}
		return false;
	}
	
	
	
	//알파벳을 만났을 때 메서드
	static int meetA(String str) {
		int ans=-1;
		switch (str) {
		case "a":
			ans=0;
			break;
		case "b":
			ans=1;
			break;
		case "c":
			ans=2;
			break;
		case "d":
			ans=3;
			break;
		case "e":
			ans=4;
			break;
		case "f":
			ans=5;
			break;
		}
		
		return ans;
	}
	
	//알파벳을 만났을 때 메서드
	static int meetB(String str) {
		int ans=-1;
		switch (str) {
		case "A":
			ans=0;
			break;
		case "B":
			ans=1;
			break;
		case "C":
			ans=2;
			break;
		case "D":
			ans=3;
			break;
		case "E":
			ans=4;
			break;
		case "F":
			ans=5;
			break;
		}
		
		return ans;
	}
	
	
	
	static class Node{
		int x;
		int y;
		int[] key;
		int cnt;
		int dir;
		public Node(int x, int y, int[] key, int cnt, int dir) {
			super();
			this.x = x;
			this.y = y;
			this.key = key;
			this.cnt = cnt;
			this.dir = dir;
		}
		
		
	}

}