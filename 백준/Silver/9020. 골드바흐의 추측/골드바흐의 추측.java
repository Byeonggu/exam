import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.List;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int testCase =0; testCase<T; testCase++) {
			int B = Integer.parseInt(br.readLine());
			int i;
			boolean arr[] = new boolean[B+1];
			arr[0] = arr[1] = true;
	
			
			int sqrt = (int) Math.sqrt(B);
			for(i=2; i<=sqrt; i++) {
	
				for(int j=2; j<=B/i; j++) {
						if(arr[i*j] == true) {
							continue;
						}
						else  {
							arr[i*j] = true;
						}
				}	
			}
			//List<Integer> list = new ArrayList<Integer>();
			String result = "";
			for(i=0; i<=B; i++) {
				if(arr[i] == false&&arr[B-i]==false&&(i<=B-i)){
					result=i+" "+(B-i);
				}	
			}
			
//			for(int d=0; d<list.size(); d++) {
//				for(int j=0; j<list.size(); j++) {
//					if(list.get(d)+list.get(j)==B) {
//						if(d<=j) {
//						result=list.get(d)+" "+list.get(j);
//						}
//					}
//				}
//			}
			bw.append(result+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}