import java.util.Scanner;

public class Main {
	public static int N;
	public static int[] queen;
	public static int cnt = 0;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();

		queen = new int[N];
		dfs(0);
		System.out.println(cnt);
 
	}
 
	public static void dfs(int row) {
		if (row == N) {
				cnt++;
				return;
		}
 
		for (int i = 0; i <N; i++) {
			queen[row] = i;
			
			if(check(row)) {
				dfs(row+1);
			}
			
			
		}
		
	}
	public static boolean check(int row){
		for(int i=0; i<row; i++) {
			if(queen[i]==queen[row]|| row-i==Math.abs(queen[row]-queen[i])) {
				return false;
			}
		}
		return true;
	}
 
}