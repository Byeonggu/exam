import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		String[] str = br.readLine().split("");
		int N = str.length;
		
		for(int i=0; i<N; i++) {
			String tmp=null;
			for(int j=i; j<N; j++) {
				tmp+=str[j];
				set.add(tmp);
			}
		}
		
		System.out.println(set.size());
		
	}
	
 
}