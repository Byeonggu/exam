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
       
        StringBuilder sb = new StringBuilder();
        int V = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        StringTokenizer st;
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
        
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        
        int[] distance = new int[V+1];
        boolean[] visited = new boolean[V+1];
        
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        distance[start]= 0;
        PriorityQueue<edge> pq = new PriorityQueue<>();
        pq.add(new edge(start, 0));
        
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
        System.out.println(distance[end]);
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