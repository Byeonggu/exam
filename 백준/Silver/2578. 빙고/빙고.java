import java.util.Scanner;

public class Main {
	static int[][] binggo;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		binggo = new int[5][5];
		int[] arr = new int[25];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				binggo[i][j]=sc.nextInt();
			}
		}
		for(int t=0; t<25; t++) {
			
			int num = sc.nextInt();
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(num==binggo[i][j]) {
						binggo[i][j]=0;
					}
				}
			}

			if(check()>=3) {
				System.out.println(t+1);
				return;
			}
			
			
		}	
	}
	
	public static int check() {
		int result=0;
		//가로줄 검사
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<5; j++) {
				sum+=binggo[i][j];
			}
			if(sum==0) {
				result++;
			}
		}
		//세로줄 검사
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<5; j++) {
				sum+=binggo[j][i];
			}
			if(sum==0) {
				result++;
			}
		}
		//대각선 검사
		int sum=0;
		for(int i=0, j=0; i<5; i++,j++) {
			sum+=binggo[i][j];
		}
		if(sum==0) {
			result++;
		}
		//대각선 검사2
		sum=0;
		for(int i=0,j=4; i<5; i++,j--) {
			sum+=binggo[i][j];
		}
		if(sum==0) {
			result++;
		}
		
		return result;
	}
	
}