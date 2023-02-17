import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		sc.nextLine();
		for(int testCase = 1; testCase<=T; testCase++) {
			sb.append("#"+testCase+" ");
			String str = sc.nextLine();
			char[] arr = str.toCharArray(); 
			
			boolean flag=true;
			for(int i=0; i<str.length()/2; i++) {
				
				if(arr[i]!=arr[arr.length-1-i]){
					flag=false;
					break;
				}
			}
			if(flag) {
				sb.append(1+"\n");
			}else {
				sb.append(0+"\n");
			}
		}
		System.out.println(sb);
	}
}