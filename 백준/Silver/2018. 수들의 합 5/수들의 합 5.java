import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int start=1;
		int end =1;
		int cnt =0;
		while(end<=N&&start<=N) {
			int sum=0;
			for(int i=start; i<=end; i++){
				sum+=i;
			}
			if(sum<N) {
				end++;
			}else if(sum>N) {
				start++;
			}else if(sum==N) {
				end++;
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}