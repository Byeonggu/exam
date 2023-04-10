import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
	
	public class Main {
	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb= new StringBuilder();
			int N = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			Deque<Integer> qu = new ArrayDeque<Integer>();
			st= new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				while(!qu.isEmpty()&&arr[qu.peekLast()]> arr[i]) {
					qu.pollLast();
				}
				qu.offer(i);
				if(qu.peekFirst()<=i-L) {
					qu.pollFirst();
				}
				sb.append(arr[qu.peekFirst()]+" ");
			}
			System.out.println(sb);
			
		}
		
	
	}