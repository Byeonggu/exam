import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



public class Main {	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<String>();
        String[] input = br.readLine().split(" ");
        int M= Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        for(int i=0; i<M; i++) {
        	set.add(br.readLine());
        }
        
        ArrayList<String> result = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
        	String str = br.readLine();
        	if(set.contains(str)) {
        		result.add(str);
        	}
        }
      	Collections.sort(result);
        System.out.println(result.size());
        for(String s : result) {
        	System.out.println(s);
        }
	}
	

}