import java.io.*;



public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			int A =  Integer.parseInt(br.readLine());
			if(A == 0) break;
			int B = 2*A;
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
			int cnt =0;
			for(i=A+1; i<=B; i++) {
				if(arr[i] == false) {
					cnt +=1;
				}
			}
			System.out.println(cnt);
		}
	}
}