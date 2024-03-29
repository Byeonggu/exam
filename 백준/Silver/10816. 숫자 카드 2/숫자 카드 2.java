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
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int M= Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while(st.hasMoreTokens()) {
        	int num = Integer.parseInt(st.nextToken());
        	if(map.containsKey(num)) {
        		map.put(num, (map.get(num)+1));
        	}else {
        		map.put(num, 1);
        	}
        }
        
       
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
        	int num = Integer.parseInt(st.nextToken());
        	if(map.containsKey(num)) {
        		sb.append(map.get(num)+" ");
        	}else {
        		sb.append("0 ");
        	}
        	
        }
        System.out.println(sb);
	}
	

}