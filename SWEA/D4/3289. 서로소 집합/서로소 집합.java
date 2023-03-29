import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] p;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc<=T; tc++){
        	sb.append("#"+tc+" ");
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	int m = Integer.parseInt(st.nextToken());
        	p = new int[n+1];
        	for(int i=0; i<=n; i++) {
        		make_set(i);
        	}
        	for(int i=0; i<m; i++) {
        		st = new StringTokenizer(br.readLine());
        		int flag = Integer.parseInt(st.nextToken());
        		int a = Integer.parseInt(st.nextToken());
        		int b = Integer.parseInt(st.nextToken());
        		if(flag == 0) {
        			union(a, b);
        		}else {
        			if(findset(a)==findset(b))sb.append("1");
        			else sb.append("0");
        		}
        	}
        	sb.append("\n");
        }
        System.out.println(sb);
    }
    
    static void make_set(int x) {
    	p[x]= x;
    }
    static int findset(int x) {
    	if(x != p[x]) p[x] = findset(p[x]);
    	return p[x];
    }
    static void union(int x, int y) {
    	p[findset(y)]= findset(x);
    }

}