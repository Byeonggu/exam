import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int a = 0;
		int b = 0;
		int num = 0;
		String newnum;
		int count=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		
		if(Integer.parseInt(str) <=9){
			b = Integer.parseInt(str);
		}else{
			a = Integer.parseInt(str.substring(0, 1));
			b = Integer.parseInt(str.substring(1, 2));
		}	
		
		while(true){
			num= a+b;
			if(num <= 9){
				a = b;
				b = num;
			}else{
				a = b;
				b = Integer.parseInt(Integer.toString(num).substring(1,2));	
			}
			newnum= Integer.toString(a)+Integer.toString(b);
			count++;

			if(Integer.parseInt(newnum)==Integer.parseInt(str)) {
				System.out.println(count);
				break;
			}
		}
		br.close();	
		bw.close();

	}

	
}