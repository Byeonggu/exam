import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;



public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> Queue = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			Queue.add(i);
		}
		
		while(Queue.size()>1) {
			Queue.poll();
			
			int num = Queue.poll();
			Queue.add(num);
		}
		System.out.println(Queue.poll());
		
	}
}