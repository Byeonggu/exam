import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
			
		String[] arr =  br.readLine().split(" "); 
		
		String[] arr1 = br.readLine().split(" ");
		
		String result ="";
		for(int i = 0; i<arr1.length; i++ ) {
			if(Integer.parseInt(arr[1]) > Integer.parseInt(arr1[i])) {
				result += arr1[i]+" ";
			}
		}
		result = result.substring(0, result.length()-1);
		System.out.println(result);
		br.close();	
	}
}