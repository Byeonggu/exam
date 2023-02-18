import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	static int[] test;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st  = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		String[] arr = br.readLine().split("");
		
		int[] element= new int[4];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<4; i++) {
			element[i]=Integer.parseInt(st.nextToken());
		}
		int cnt=0;
		int start = 0;
		int end = P-1;
		test =new int[4];
		for(int i=start; i<=end; i++) {
			if(arr[i].equals("A")) {
				test[0]++;
			}else if(arr[i].equals("C")) {
				test[1]++;
			}else if(arr[i].equals("G")) {
				test[2]++;
			}else if(arr[i].equals("T")) {
				test[3]++;
			}
		}
		boolean flag= true;
		for(int i=0; i<4; i++) {
			if(test[i]<element[i]) {
				flag=false;
			}
		}
		if(flag)cnt++;
		
		while(end<S-1) {
			minus(arr[start]);
			start++;
			end++;
			add(arr[end]);
			
			flag=true;
			for(int i=0; i<4; i++) {
				if(test[i]<element[i]) {
					flag=false;
				}
			}
			if(flag)cnt++;

		}
		System.out.println(cnt);
		
	}
	public static void add(String s) {
		if(s.equals("A")) {
			test[0]++;
		}else if(s.equals("C")) {
			test[1]++;
		}else if(s.equals("G")) {
			test[2]++;
		}else if(s.equals("T")) {
			test[3]++;
		}
	}
	public static void minus(String s) {
		if(s.equals("A")) {
			test[0]--;
		}else if(s.equals("C")) {
			test[1]--;
		}else if(s.equals("G")) {
			test[2]--;
		}else if(s.equals("T")) {
			test[3]--;
		}
	}
}