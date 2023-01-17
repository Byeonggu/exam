import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr1= new int[9][9] ;
		int maxNum=0;
		int X = 0;
		int Y = 0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr1[i][j] = sc.nextInt();
				if(arr1[i][j]>= maxNum) {
					maxNum=arr1[i][j];
					X=i+1;
					Y=j+1;
				}
			}
		}
		
		System.out.println(maxNum);
		System.out.println(X+" "+Y);
		
	}
}