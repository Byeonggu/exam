import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		int right = 0;
		int left =0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
			right += arr[i];
			left = Math.max(left, arr[i]);
		}
		
//		System.out.println(Arrays.toString(arr));
		
		
		while(left <= right) {
			int mid = (right+left) / 2;

        	int result = fnc(mid);
        	
        	if(result>M){
        		left=mid+1;
        	}else{	
        		right=mid-1;
        	}
     
		}
//		int max =0;
//		int num =0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]+num>=left) {
//				max= Math.max(arr[i]+num, max);
//				num=0;
//			}else {
//				num+=arr[i];
//			}
//		}
		
		
		System.out.println(left);
	}
	
	private static int fnc(int mid) {
		// TODO Auto-generated method stub
		int cnt =0;
		int tmp=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]+tmp>mid) {
				cnt++;
				tmp=0;
			}
			tmp+=arr[i];
			
		}
		
		if(tmp != 0) cnt++;
		return cnt;
	}
	
	
	
	
 
}