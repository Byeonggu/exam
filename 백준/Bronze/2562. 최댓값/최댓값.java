import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.parseInt(br.readLine());
		int count=1;
		
		
		for(int i = 0; i<8; i++ ) {
			int num = Integer.parseInt(br.readLine());
			if(max <= num) {
				max= num;
				count= i+2;
			}
			
		}
		String result =  max + "\n"+ count;
		System.out.println(result);
		br.close();	
	}
}