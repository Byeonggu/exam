import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st  = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int cnt =0;
		for(int i=0; i<N; i++){
			int target = arr[i];
			int start=0;
			int end=N-1;
			
			while(start<end) {
				int tmp = arr[start]+arr[end];
				if(tmp<target) {
					start++;
				}else if(tmp>target) {
					end--;
				}else if(tmp==target) {
					if(start == i) {
						start++;
					}else if(end ==i ){
						end--;
					}else {
						cnt++;
						break;
					}
					
				}
			}
			
		}
		System.out.println(cnt);
		
		
	}
}