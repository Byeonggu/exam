import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static int[][] distance;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringBuilder sb = new StringBuilder();
        int testCase=0;
        while(true) {
        	testCase++;
	        int N = Integer.parseInt(br.readLine());
	        if(N == 0)return;
	        map = new int[N][N];
	        distance = new int[N][N];
		    visited = new boolean[N][N];
	        StringTokenizer st;
	        for(int i=0; i<N; i++) {
	        	st = new StringTokenizer(br.readLine());
	        	for(int j=0; j<N; j++) {
	        		map[i][j]= Integer.parseInt(st.nextToken());
	        		distance[i][j] =Integer.MAX_VALUE;
	        	}
	        }
	        distance[0][0] = map[0][0];
	       
	        PriorityQueue<edge> pq = new PriorityQueue<>();
	        pq.add(new edge(0, 0, map[0][0]));
	        
	        while(!pq.isEmpty()) {
	        	edge cur = pq.poll();
	        	
	        	for(int d=0; d<4; d++) {
	        		int nx = cur.x+dx[d];
	        		int ny = cur.y+dy[d];
	        		if(nx>=0 && nx<N && ny>=0 && ny<N) {
	        			if(distance[nx][ny] > distance[cur.x][cur.y]+ map[nx][ny]) {
	        				distance[nx][ny] = distance[cur.x][cur.y]+ map[nx][ny];
	        				pq.offer(new edge(nx, ny, distance[nx][ny]));
	        			}
	        		}
	        		
	        	}
	        }
//	        for(int[] arr: distance) {
//	        	System.out.println(Arrays.toString(arr));
//	        }
	        System.out.println("Problem "+testCase+": "+distance[N-1][N-1]);
        }
	}

    static class edge implements Comparable<edge>{
    	 int x;
    	 int y;
         int w;
         
         public edge(int x, int y, int w) {
             this.x = x;
             this.y = y;
             this.w = w;
         }

         @Override
         public int compareTo(edge o) {
             return this.w - o.w;
         }
    }

}