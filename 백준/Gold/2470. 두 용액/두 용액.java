import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[N];
		for(int i=0; i<N; i++) {
			arr[i]= Long.parseLong(st.nextToken());
		}
		int left =0;
		int right =N-1;
		
		Arrays.sort(arr);
		
		long[] result= new long[2];
		long min =Integer.MAX_VALUE;
		while(left!=right) {
			long tmp =Math.abs(arr[left]+arr[right]);
			if(min>tmp) {
				min= tmp;
				result[0]= arr[left];
				result[1]= arr[right];
			}
			if(Math.abs(arr[left])>=Math.abs(arr[right])){
				left++;
			}else {
				right--;
			}
		}
		System.out.println(result[0]+" "+result[1]);
		
		
	}
	
 
}