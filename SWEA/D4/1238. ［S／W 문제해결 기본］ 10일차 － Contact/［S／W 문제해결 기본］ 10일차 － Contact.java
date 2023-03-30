import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	
	static int[][] cnt;
	static boolean[] visited;
	static int[] num;
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int tc=1; tc<=10; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			cnt = new int[101][101];
			visited= new boolean[101];
			num= new int[101];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N/2; i++) {
				int a =Integer.parseInt(st.nextToken());
				int b =Integer.parseInt(st.nextToken());
				cnt[a][b]= 1;
			}
			
			Queue<Integer> qu = new LinkedList<Integer>();
			qu.add(V);
			visited[V]=true;
			num[V]=1;
			int result=0;
			
			while(!qu.isEmpty()) {
				int index = qu.poll();
				
				for(int i=1; i<=100; i++) {
					if(cnt[index][i]==1&&!visited[i]) {
						num[i]=num[index]+1;
						result= Math.max(num[i], result);
						visited[i]=true;
						qu.add(i);
					}
				}
			}
			
			int max=0;
			for(int i=1; i<101; i++) {
				if(num[i]==result) {
					max=Math.max(i, max);
				}
			}
			
			sb.append("#"+tc+" "+max+"\n");
			
		}
		System.out.println(sb);
	}
    
}