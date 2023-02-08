import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] sArr = str.split("");
		ArrayList<Integer> arr = new ArrayList<>();
		int N=str.length();
		int cnt =0; 
		for(int i=1; i<=Math.sqrt(N); i++) {
			 if(N % i == 0){
				 arr.add(i);
				 if(N / i != i){ 
				    arr.add(N / i);
				 }
			 }
		}
		Collections.sort(arr);
		int r;
		int c;
		if(arr.size()%2==0) {
			r=arr.get(arr.size()/2-1);
			c=arr.get(arr.size()/2);
		}else {
			r=arr.get(arr.size()/2);
			c=arr.get(arr.size()/2);
		}
		
		String[][] map = new String[r][c];
		int num=0;
		outer:for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				map[j][i]=sArr[num++];
				if(num==sArr.length) {
					break outer;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				sb.append(map[i][j]);
			}
		}
		System.out.println(sb);
		
		
	}
}