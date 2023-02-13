import java.util.Scanner;

public class Main {
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { -1, 1, 0, 0 };
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr1= new int[102][102] ;
		int cnt = 0;
		int cnt1 = 0;
		int T =sc.nextInt();
		for(int i=0; i<T; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			for(int j=X; j<X+10; j++) {
				for(int z=Y; z<Y+10; z++) {
					
						arr1[j][z]=1;
	
				}
			}
			
		}
		for(int j=0; j<=101; j++) {
			for(int z=0; z<=101; z++) {
				if (arr1[j][z] == 1) {
	                for (int k = 0; k < 4; k++) {
	                   int nextX = j + dx[k];
	                   int nextY = z + dy[k];
	                    if (arr1[nextX][nextY] == 0) {
	                    	cnt++;      
	                    }
	                }
	            }

			}
		
		}
		System.out.println(cnt);
		

	}
}