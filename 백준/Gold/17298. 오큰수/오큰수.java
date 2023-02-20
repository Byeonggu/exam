import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int[] arr =new int[T];
		for(int i=0; i<T; i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int[] result = new int[T];
		StringBuilder sb= new StringBuilder();
		stack.push(0);
		for(int i=1; i<T; i++) {
			while(!stack.empty()&&arr[stack.peek()]<arr[i]){
				int tmp = stack.pop();
				result[tmp]=arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int tmp=stack.pop();
			result[tmp]=-1;
		}
	
		for(int i: result) {
			sb.append(i+" ");
		}
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
	}
}