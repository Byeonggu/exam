import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
    	int[] dp = new int[12];
    	dp[0] = 1;
    	dp[1] = 1;
    	dp[2] = 2;
    	for(int i=3; i<12; i++) {
    		dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
    	}
        StringBuilder sb = new StringBuilder();
        for(int tc = 0; tc<T; tc++) {
        	int N = Integer.parseInt(br.readLine());
        	sb.append(dp[N]+"\n");
        }
        System.out.println(sb);
	}

}