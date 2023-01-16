import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int i;
		boolean arr[] = new boolean[B+1];
		arr[0] = arr[1] = true;

		
		int sqrt = (int) Math.sqrt(B);
		for(i=2; i<=sqrt; i++) {

			for(int j=2; j<=B/i; j++) {
					if(arr[i*j] == true) {
						continue;
					}
					else  {
						arr[i*j] = true;
					}
			}	
		}

		for(i=A; i<=B; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
	}
}