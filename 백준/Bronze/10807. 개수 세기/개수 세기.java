import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		int n = Integer.parseInt(br.readLine());	
		String[] arr =  new String[n]; 
		arr = br.readLine().split(" ");
		int count = 0;
		String target=br.readLine();
		
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i].equals(target)) {
				count++;
			}
		}
		System.out.println(count);
		br.close();	
	}
}