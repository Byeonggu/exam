import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[T];
		int[] sArr = new int[T];
		HashMap<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());	
		for(int i=0; i<T; i++) {
			sArr[i]=arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sArr);
		int idx=0;
		for(int i: sArr) {
			if(!map.containsKey(i)) {
				
				map.put(i, idx);
				idx++;
			}
		}
		
		for(int i=0; i<T; i++) {
			arr[i]=map.get(arr[i]);
			bw.append(arr[i]+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}