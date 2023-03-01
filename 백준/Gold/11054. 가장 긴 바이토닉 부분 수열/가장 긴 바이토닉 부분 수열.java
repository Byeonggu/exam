import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int[] dp = new int [T];
		int[] rdp = new int[T];
		int result=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<T; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<T; i++) {
			int max =0;
			for(int j=0; j<i; j++){
				if(arr[i]>arr[j]) {
						max=Math.max(max, dp[j]);
				}
			}
			dp[i]= max+1;
		}
		
		
		for(int i=T-1; i>=0; i--) {
			int max =0;
			for(int j=T-1; j>i; j--){
				if(arr[i]>arr[j]) {
						max=Math.max(max, rdp[j]);
				}
			}
			rdp[i]=max+1;
		}
		
		for(int i=0; i<T; i++) {
			int tmp=dp[i]+rdp[i];
			result= Math.max(result, tmp);
		}
		System.out.println(result-1);
		
	}
}