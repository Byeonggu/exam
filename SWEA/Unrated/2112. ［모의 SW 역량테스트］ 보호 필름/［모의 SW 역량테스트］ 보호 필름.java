import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static int[][] map;
	static int K;
	static int D;
	static int W;
	static int[] insert;
	static int result;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int tc = 1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			D = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			map= new int[D][W];
			insert = new int[D];
			result= 1000;
			for(int i=0; i<D; i++) {
				insert[i]= 2;
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<W; j++) {
					map[i][j]= Integer.parseInt(st.nextToken());
				}
			}
			if(check()) {
				sb.append("#"+tc+" "+ 0+"\n");
			}else {
				dfs(0, 0);
				sb.append("#"+tc+" "+ result+"\n");
			}
			
			
			
		}	
		System.out.println(sb);
	}
	public static void dfs(int cnt, int idx) {
		
		if(cnt >=result) {
			return;
		}
		if(idx==D) {
			if(check()){
//				System.out.println(Arrays.toString(insert));
				result= Math.min(cnt, result);
			}
			return;
		}
		dfs(cnt, idx+1);
		insert[idx]=0;
		dfs(cnt+1, idx+1);
		insert[idx]=1;
		dfs(cnt+1, idx+1);
		insert[idx]=2;
		
		
			
		
		
	}
	
	public static boolean check() {
		outer:for(int i=0; i<W; i++) {
			int count =1;
			for(int j=0; j<D-1; j++){
				if(insert[j]!=2 && insert[j+1]!=2) {
					if(insert[j]==insert[j+1])count++;
					else count=1;
				}else if(insert[j]!=2) {
					if(insert[j]==map[j+1][i])count++;
					else count=1;
				}else if(insert[j+1]!=2) {
					if(insert[j+1]==map[j][i])count++;
					else count=1;
				}else if(map[j][i]==map[j+1][i]){
					count++;
				}else {
					count=1;
				}
				if(count==K){
					continue outer;
				}
				if(j==D-2) {
					return false;
				}
			}
		}
	return true;
	}
}