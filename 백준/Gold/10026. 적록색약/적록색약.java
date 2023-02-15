import java.util.Scanner;

public class Main {
	
	static String[][] map;
	static boolean[][] visit;
	static boolean[][] visit2;
	static int cnt=0;
	static int cnt2=0;
	static int N;
	static int[] dx= {0, -1, 0, 1};
	static int[] dy= {-1, 0, 1, 0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		map = new String[N][N];
		visit = new boolean[N][N];
		visit2 = new boolean[N][N];
		for(int i=0; i<N; i++) {
			map[i]=sc.nextLine().split("");
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(visit[i][j]!=true) {
					fnc(map[i][j], i, j);
					cnt++;
				}
				if(visit2[i][j]!=true) {
					fnc2(map[i][j], i, j);
					cnt2++;
				}
			}
		}
		
		System.out.print(cnt+" ");
		System.out.print(cnt2);
		
	}
	public static void fnc2(String color, int x, int y){
		String color2=null;
		if(color.equals("R")) {
			color2="G";
		}else if(color.equals("G")) {
			color2="R";
		}
		visit2[x][y]= true;
		for(int i=0; i<4; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			if(newX<N&&newX>=0&&newY<N&&newY>=0) {
				if((map[newX][newY].equals(color)||map[newX][newY].equals(color2))&&visit2[newX][newY]!=true) {
					fnc2(color, newX, newY);
				}
			}
		}
	}
	
	
	
	public static void fnc(String color, int x, int y) {
		visit[x][y]= true;
		for(int i=0; i<4; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			if(newX<N&&newX>=0&&newY<N&&newY>=0) {
				if(map[newX][newY].equals(color)&&visit[newX][newY]!=true) {
					fnc(color, newX, newY);
				}
			}
		}
	}
}