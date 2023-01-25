import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr= new int[3][2];
		for(int i=0; i<3; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		int X = arr[0][0];
		int Y = arr[0][1];
		
		
		if(X == arr[1][0]) {
			X=arr[2][0];
		}else
		if(X == arr[2][0]) {
			X=arr[1][0];
		}
		
		if(Y == arr[1][1]) {
			Y=arr[2][1];
		}else
		if(Y == arr[2][1]) {
			Y=arr[1][1];
		}
		
		System.out.println(X+" "+Y);
	}	
	
}