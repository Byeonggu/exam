import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
	
		
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int sum =1;
		for(int i=0; i<arr.length; i++) {
			if(sum<arr[i]) {
				System.out.println(sum);
				return;
			}
			sum+=arr[i];
		}
		System.out.println(sum);

	}
	
	
}