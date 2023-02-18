import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		
		int cnt=1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=cnt) {
				while(arr[i]>=cnt) {
					stack.push(cnt++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}else {
				int tmp = stack.pop();
				sb.append("-\n");
				if(tmp>arr[i]) {
					System.out.println("NO");
					return;
				}
			}
			
			
		}
	
		System.out.println(sb);
		
	}
}