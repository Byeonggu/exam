import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[T][2];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0]= Integer.parseInt(st.nextToken());
			arr[i][1]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (a1, a2) ->{
			if(a1[0] == a2[0]) {
				return a1[1] - a2[1];
			}else {
				return a1[0] - a2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i= 0; i<T; i++) {
			sb.append(arr[i][0]+" "+arr[i][1]+"\n");
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	
}