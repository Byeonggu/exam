import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import java.util.StringTokenizer;

public class Main {	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> dogam = new HashMap<Integer, String>();
        Map<String, Integer> dogam1 = new HashMap<String, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=N; i++) {
        	String input=br.readLine();
        	dogam.put(i, input );
        	dogam1.put(input, i);
        	
        }
        
        for(int i=0; i<T; i++) {
        	String str = br.readLine();
        	try {
				int num = Integer.parseInt(str);
				sb.append(dogam.get(num)+"\n");
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				sb.append(dogam1.get(str)+"\n");
			}
        	
        }
        System.out.println(sb);
        
	}
	

}