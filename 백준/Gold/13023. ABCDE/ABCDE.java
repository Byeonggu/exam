

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static boolean flag=false;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		list= new ArrayList[N];
		visited= new boolean[N];
		for(int i=0; i<N; i++) {
			list[i]= new ArrayList<Integer>();
		}
		for(int i=0; i<M; i++) {
			st= new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			list[left].add(right);
			list[right].add(left);
		}
		
		for(int i=0; i<N; i++) {
			dfs(i, 1);
			if(flag)break;
		}
		
		if(flag) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
	
	static void dfs(int tmp, int depth) {
		if(depth==5 || flag) {
			flag= true;
			return;
		}
		
		visited[tmp]= true;
		for(int i: list[tmp]) {
			if(!visited[i]) {
				dfs(i, depth+1);
			}
		}
		visited[tmp]=false;
	}
}