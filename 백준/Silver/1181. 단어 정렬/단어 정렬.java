import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[T];
		
		for(int i=0; i<T; i++) {
			arr[i]= br.readLine();
			
		}
		
		Arrays.sort(arr, (a1, a2) ->{
			if(a1.length() == a2.length()) {
				return a1.compareTo(a2);
			}else {
				return a1.length() - a2.length();
			}
		});
		
		
		System.out.println(arr[0]);
		for(int i=1; i<T; i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
		
		
	}
	
	
}