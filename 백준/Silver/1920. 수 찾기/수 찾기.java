import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int[] target = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			target[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i=0; i<M; i++) {
			int high=arr.length-1;
			int low =0;
			boolean flag = false; 
			while(low<=high){
				int mid =low+(high-low)/2;
				if(target[i]==arr[mid]) {
					sb.append("1\n");
					flag= true;
					break;
				}else if(target[i]>arr[mid]) {
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
			if(!flag)sb.append("0\n");
		}
		System.out.println(sb);
		
	}
}