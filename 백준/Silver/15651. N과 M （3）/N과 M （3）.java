
import java.util.Scanner;
public class Main {
	 static boolean[] visit;
	 static int[] arr;
	 static StringBuilder sb= new StringBuilder();
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr= new int[M];
		visit = new boolean[N];
		dfs(N,M,0);
		System.out.println(sb);
	}
	 
	 public static void dfs(int N, int M, int depth) {
		 if(depth==M) {
			 for(int i : arr) {
				 sb.append(i+" ");
			 }
			 sb.append("\n");
			 return;
		 }
		 
		 for(int i=0; i<N; i++) {
				 arr[depth]= i+1;
				 dfs(N, M, depth+1);
		 }
	 }

}