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
		int M = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int cnt =0;
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int tmp =arr[start]+arr[end];
			if(M==tmp) {
				cnt++;
				start++;
			}else if(M<tmp) {
				end--;
			}else if(M>tmp) {
				start++;
			}
		}
		System.out.println(cnt);
		
		
		
	}
}