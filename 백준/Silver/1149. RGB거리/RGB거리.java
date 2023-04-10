import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] map = new int[N][3];
		int[][] dp = new int[N][3];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			map[i][0]= Integer.parseInt(st.nextToken());
			map[i][1]= Integer.parseInt(st.nextToken());
			map[i][2]= Integer.parseInt(st.nextToken());
		}
		dp[0][0]= map[0][0];
		dp[0][1]= map[0][1];
		dp[0][2]= map[0][2];
		
		for(int i=1; i<N; i++) {
			dp[i][0]= map[i][0]+Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1]= map[i][1]+Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2]= map[i][2]+Math.min(dp[i-1][0], dp[i-1][1]);
			
			
		}

//		for(int[] i : dp) {
//			System.out.println(Arrays.toString(i));
//		}
//		
		int ans = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
		System.out.println(ans);
		
	}

}