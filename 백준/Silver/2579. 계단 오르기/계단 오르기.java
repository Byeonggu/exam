import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N+1];
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		if(N==1) {
			System.out.println(arr[0]);
			return;
		}
		dp[1]= arr[0];
		dp[2]=Math.max(arr[1]+arr[0], arr[1]);
		for(int i=3; i<=N; i++) {
			int tmp1 = arr[i-2]+dp[i-3];
			int tmp2 = dp[i-2];
			dp[i]=Math.max(tmp1, tmp2)+ arr[i-1];
		}
		System.out.println(dp[dp.length-1]);
		
	}

}