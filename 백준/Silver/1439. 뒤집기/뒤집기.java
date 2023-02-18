import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int cnt0 =0;
		int cnt1 =0;
		String[] arr0= N.split("1");
		String[] arr1= N.split("0");
		for(int i=0; i<arr0.length; i++) {
			if(arr0[i].contains("0")) {
				cnt0++;
			}
		}
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i].contains("1")) {
				cnt1++;
			}
		}
		
		System.out.println(Math.min(cnt0,cnt1));
		
	}
}