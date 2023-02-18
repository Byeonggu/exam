import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long cnt =0;
		long sum=0;
		int i=1;
		while(N>0){
			if(sum > N)	break;
			sum += i++;
			cnt ++;
		}
		System.out.println(cnt-1);
		
	}
}