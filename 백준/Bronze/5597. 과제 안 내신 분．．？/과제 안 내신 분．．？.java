import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder result = new StringBuilder();
			int [] intarr = new int[28];
			
			for(int i=0; i<28; i++) {
				int num = Integer.parseInt(br.readLine());
				intarr[i]=num;
			}
			
			for(int i = 1; i<=30; i++ ) {
				int j =0;
				while(true) {
					
					if(intarr[j]==i) {
						break;
					}
					if(j==27) {
						result.append(i+"\n");
						break;
					}
					j++;
				}
			}
			System.out.println(result.toString().substring(0, result.toString().length()-1));
			br.close();	
	}
}