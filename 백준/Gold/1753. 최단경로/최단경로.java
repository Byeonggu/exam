import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        
        ArrayList<edge>[] graph = new ArrayList[V+1];
        for(int i=0; i<=V; i++) {
        	graph[i]= new ArrayList<>();
        }
        for(int i=0; i<E; i++) {
        	st = new StringTokenizer(br.readLine());
        	int u = Integer.parseInt(st.nextToken());
        	int v = Integer.parseInt(st.nextToken());
        	int w = Integer.parseInt(st.nextToken());
        	graph[u].add(new edge(v, w));
        }
        int[] distance = new int[V+1];
        boolean[] visited = new boolean[V+1];
        
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        distance[K]= 0;
        PriorityQueue<edge> pq = new PriorityQueue<>();
        pq.add(new edge(K, 0));
        
        while(!pq.isEmpty()) {
        	edge cur = pq.poll();
        	
        	if(visited[cur.e])continue;
        	
        	visited[cur.e] = true;
        	
        	for(edge next: graph[cur.e]){
        		if(distance[next.e]> distance[cur.e]+ next.w) {
        			distance[next.e]=distance[cur.e]+ next.w;
        			pq.add(new edge(next.e, distance[next.e]));
        		}
        	}
        }
        for(int i=1; i<=V; i++) {
        	if(distance[i]== Integer.MAX_VALUE)sb.append("INF\n");
        	else sb.append(distance[i]+"\n");
        }
  
        System.out.println(sb);
	}

    static class edge implements Comparable<edge>{
    	 int e;
         int w;
         
         public edge(int e, int w) {
             this.e = e;
             this.w = w;
         }

         @Override
         public int compareTo(edge o) {
             return this.w - o.w;
         }
    }

}