import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long[] lan;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		lan = new long[N];
		for(int i=0; i<N; i++) {
			lan[i]= Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(lan);
		
		long left = 0;
		long right = lan[N-1]+1;
		
//		long result = 0;
		while(left<right) {
			long mid = (right+left)/2;
			long count = fnc(mid);
			if(M > count){
				right = mid;
			}else {
				left= mid+1;
			}
		}
		System.out.println(left-1);
	}

	private static long fnc(long mid) {
		// TODO Auto-generated method stub
		long cnt =0;
		for(int i=0; i<lan.length; i++) {
			cnt += lan[i]/mid;
		}
		
		
		return cnt;
	}
	
 
}