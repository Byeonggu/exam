import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] coin = new int[N];
        int[] dp = new int[M+1];
        
        for(int i=0; i<N; i++) {
        	coin[i]= Integer.parseInt(br.readLine());
        }
        dp[0]=1;
        
        for(int j=coin[0]; j<dp.length; j++) {
        	if(j%coin[0]==0) {
        		dp[j]=1;
        	}
    		
    	}
      //  System.out.println("0 :"+Arrays.toString(dp));
        
        for(int i=1; i<N; i++) {
        	for(int j=coin[i]; j<dp.length; j++) {
        		dp[j]=dp[j]+dp[j-coin[i]];
        		
        	}
        	 
        }
        System.out.println(dp[M]);
    }
}