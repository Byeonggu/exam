import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			int T = Integer.parseInt(br.readLine());
			long[] arr = new long[T];
			if(T>3) {
				arr[0]=1;
				arr[1]=1;
				arr[2]=1;
				for(int j=3; j<T; j++) {
					arr[j]=arr[j-3]+arr[j-2];
				}
				sb.append(arr[arr.length-1]+"\n");
			}else {
				sb.append(1+"\n");
			}
			
		}
		System.out.println(sb);
		
	}

}