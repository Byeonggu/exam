import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T+1];
		
		arr[0]=0;
		arr[1]=1;
		for(int i=2; i<T+1; i++) {
			arr[i]= arr[i-1]+ arr[i-2];
		}
		System.out.println(arr[T]);
		
	}

}