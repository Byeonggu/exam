import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	public static void turn(int idx) {
		if(arr[idx]==1) {
			arr[idx]=0;
		}else {
			arr[idx]=1;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=N; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		int T =Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			int cnt = N/idx;
			if(gender==1) {
				for(int j =1; j<=cnt; j++) {
					turn(idx*j);
				}
			}else {
				int idx1=1;
				turn(idx);
				while(idx-idx1>0&&idx+idx1<=N){
					//System.out.println(L+" "+R);
					if(arr[idx-idx1]==arr[idx+idx1]) {
						turn(idx-idx1);
						turn(idx+idx1);
						idx1++;
						
					}
					else break;
				}
				
			}
		}
		
		for(int i=1; i<=N; i++) {
			
				sb.append(arr[i]+" ");
				if(i%20==0){
					sb.append("\n");
				}
			
		}
		System.out.println(sb);
//		for(int s : arr) {
//			System.out.print(s+" ");
//		}
	}

}