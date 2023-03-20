import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int tc = 1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());	
			String[] arr = br.readLine().split("");
			LinkedList<String> qu = new LinkedList<>();
			for(int i=0; i<N; i++) {
				qu.add(arr[i]);
			}
			Set<String> list = new HashSet<>();
			for(int i=0; i<N/4; i++) {
				int index=0;
				for(int j=0; j<4; j++) {
					String str="";
					while(str.length()!=N/4) {
						str+=qu.get(index);
						index++;
					}
					list.add(str);
				}				
				qu.add(0, qu.remove(N-1));
			}
			Integer[] result = new Integer[list.size()];
			int idx=0;
			for(String s: list) {
				result[idx++]=Integer.parseInt(s, 16);
			}
			Arrays.sort(result, Collections.reverseOrder());	
			sb.append("#"+tc+" "+result[K-1]+"\n");
		}	
		System.out.println(sb);
	}

}