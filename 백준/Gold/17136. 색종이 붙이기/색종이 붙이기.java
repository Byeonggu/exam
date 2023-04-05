import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] map = new int[10][10];
	static int min;
	static int[] puzzle = new int[6];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Arrays.fill(puzzle, 5);
		puzzle[0]=0;
		min = Integer.MAX_VALUE;
		for(int i=0; i<10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++) {
				map[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);
		if(min == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(min);
		
	}
	
	static void dfs(int cnt) {
		int x =-1;
		int y =-1;
		outer:for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(map[i][j]==1) {
					x=i;
					y=j;
					break outer;
				}
			}
		}
		
		if(x==-1 && y==-1) {
			min = Math.min(min, cnt);
			return;
		}
		
		
		int max =5;
		while(max>0) {
			if(check(x, y, max)) {
				break;
			}
			max--;
		}
		
		for(int size =1; size <=max; size++) {
			if(puzzle[size]==0)continue;
			
			stick(x, y, size);
			puzzle[size]--;
			dfs(cnt+1);
			
			off(x, y, size);
			puzzle[size]++;
		}
		
		
	}
	
	static void stick(int x, int y, int size) {
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				map[i][j]= 0;
			}
		}
	}
	static void off(int x, int y, int size) {
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				map[i][j]= 1;
			}
		}
	}
	
	
	static boolean check(int x, int y, int size) {
		
		boolean flag =true;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(x+i >= 10 ||y+j >= 10 || map[x+i][y+j] == 0) {
					flag =false;
					return flag;
				}
			}
		}
		return flag;
	}
	
	
}