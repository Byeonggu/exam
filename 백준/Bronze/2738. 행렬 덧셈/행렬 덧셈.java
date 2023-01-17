
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr1= new int[N][M] ;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr1[i][j] = 0;
			}
		}
		
		
		for(int z=0; z<2; z++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					arr1[i][j] += sc.nextInt();
				}
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}