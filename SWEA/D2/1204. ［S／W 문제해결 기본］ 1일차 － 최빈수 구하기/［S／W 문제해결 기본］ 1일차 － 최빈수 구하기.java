import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int testCase=0; testCase<T; testCase++) {
			int N=sc.nextInt();
			int[] arr= new int[101];
			for(int i=0; i<1000; i++) {
				arr[sc.nextInt()]+=1;
			}
			int max=Integer.MIN_VALUE;
			int idx= -1;
			for(int i=0; i<101; i++) {
				if(arr[i]>=max) {
					max=arr[i];
					idx=i;
				}
			}
			sb.append("#"+N+" "+idx+"\n");
		}
		System.out.println(sb);
	}
}
