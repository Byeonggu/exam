import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[][] arr = new String[T][2];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0]=st.nextToken();
			arr[i][1]=st.nextToken();
		}
		Arrays.sort(arr, (a1, a2) ->{
				return Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
		});
		
		for(String[] s: arr) {
			System.out.println(s[0]+" "+s[1]);
		}
		
		
	}
}