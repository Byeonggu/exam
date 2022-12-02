import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine()); 
		
		String[] arr1 = br.readLine().split(" ");
		int max = Integer.parseInt(arr1[0]);
		int min = Integer.parseInt(arr1[0]);
		String result ="";
		
		for(int i = 0; i<num; i++ ) {
			if(max <= Integer.parseInt(arr1[i])) {
				max= Integer.parseInt(arr1[i]);
			}
			if(min >= Integer.parseInt(arr1[i])) {
				min= Integer.parseInt(arr1[i]);
			}
		}
		result =  min+ " "+ max;
		System.out.println(result);
		br.close();	
	}
}