import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Node[] arr = new Node[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = new Node(Integer.parseInt(br.readLine()), i);
		}
	
		Arrays.sort(arr);
		int max=0;
		for(int i=0; i<N; i++) {
			
			max= Math.max(arr[i].index-i, max);	
			
		}
		System.out.println(max+1);
		
	}
	
	static class Node implements Comparable<Node>{
		int value;
		int index;
		public Node(int value, int index) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.index = index;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.value- o.value;
		}
	}
}