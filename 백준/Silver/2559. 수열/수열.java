import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		int[] sum = new int[N-K+1];
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<sum.length; i++){
			
			for(int j=0; j<K; j++) {
				sum[i]+=arr[i+j];
			}
			max= Math.max(max, sum[i]);
		}
		//System.out.println(Arrays.toString(sum));
		System.out.println(max);

	}
	
	
}