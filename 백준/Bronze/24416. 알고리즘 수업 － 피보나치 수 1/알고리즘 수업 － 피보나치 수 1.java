import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fib(n)+" "+(n-2));
	}
	
	public static int fib(int n) {
		int[] arr = new int[n+1];
		arr[1]=1;
		arr[2]=1;
		for(int i=3;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}

}