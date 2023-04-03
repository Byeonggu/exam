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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] input = new int[N+1];
		int[] output = new int[N+1];
		ArrayList<Node>[] arr = new ArrayList[N+1];
	
		boolean[] visited = new boolean[N+1];
		for(int i=0; i<=N; i++) {
			arr[i]= new ArrayList<>();
			output[i]=1;
		}
		for(int i=1; i<=M; i++) {
			st= new StringTokenizer(br.readLine());
			int x= Integer.parseInt(st.nextToken());
			int y= Integer.parseInt(st.nextToken());
			input[y]++;
			arr[x].add(new Node(1,y));
			
			
		}
		
		Queue<Integer> qu = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			if(input[i]==0) {
				qu.add(i);
				
			}
		}
		while(!qu.isEmpty()) {
			int tmp = qu.poll();
			
			if(arr[tmp].size()==0){
//				System.out.println(Arrays.toString(output));
//				output[tmp]++;
				continue;
			}
			for(Node n : arr[tmp]) {
//				System.out.println(tmp);
				visited[tmp]= true;
				
				int nextNode = n.next;
				output[nextNode]= output[tmp]+1;
				if(!visited[nextNode]) {
					input[nextNode]--;
					
				}
				if(input[nextNode]==0 && !visited[nextNode]) {
					visited[nextNode]= true;
					qu.add(nextNode);
				}
			}	
			
		}
		for(int i=1; i<output.length; i++) {
			sb.append(output[i]+" ");
		}
		System.out.println(sb);
	}
	
	static class Node{
		int value;
		int next;
		public Node(int value, int next) {
			super();
			this.value = value;
			this.next = next;
		}
		
	}
}