import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
	static int[] p;
	static ArrayList<island> list;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc<=T; tc++){
        	sb.append("#"+tc+" ");
        	int n = Integer.parseInt(br.readLine());
        	p = new int[n+1];
        	for(int i=0; i<=n; i++) {
        		make_set(i);
        	}
        	double[] xArr= new double[n];
        	double[] yArr= new double[n];
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i=0; i<n; i++) {
        		xArr[i]= Double.parseDouble(st.nextToken());
        	}
        	st = new StringTokenizer(br.readLine());
        	for(int i=0; i<n; i++) {
        		yArr[i]= Double.parseDouble(st.nextToken());
        	}
        	double E = Double.parseDouble(br.readLine());
        	
        	list= new ArrayList<>();
        	for(int i=0; i<n; i++) {
        		for(int j=i+1; j<n; j++) {
        			double distance = Math.pow(xArr[i]-xArr[j],2)+Math.pow(yArr[i]-yArr[j],2);
        			list.add(new island(i, j, distance));
        		}
        	}
        	Collections.sort(list);
        	double ans = 0;
    		int pick = 0;
    		for(island i : list) {
    			int px = findset(i.x);
    			int py = findset(i.y);
    			
    			if(px != py) {
    				union(px,py);
    				ans +=i.distance;
    				pick++;
    			}
    			
    			if(pick ==(n-1))break;
    		}
        	sb.append(Math.round(ans*E));
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
    	p[y]=x;
    }

    static class island implements Comparable<island>{
    	int x;
    	int y;
    	double distance;
		public island(int x, int y, double distance) {
			super();
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
		@Override
		public int compareTo(island o) {
			// TODO Auto-generated method stub
			if(this.distance>=o.distance) return 1;
			return -1;
		}
    	
    }
}