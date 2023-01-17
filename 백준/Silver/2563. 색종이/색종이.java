import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr1= new int[100][100] ;
		int cnt = 0;
		int cnt1 = 0;
		int T =sc.nextInt();
		for(int i=0; i<T; i++) {
			int X = sc.nextInt()-1;
			int Y = sc.nextInt()-1;
			for(int j=X; j<X+10; j++) {
				for(int z=Y; z<Y+10; z++) {
					arr1[j][z] +=1;
				}
			}
			
		}
		for(int j=0; j<100; j++) {
			for(int z=0; z<100; z++) {
				if(arr1[j][z]>= 2)cnt++;
				if(arr1[j][z]== 1)cnt1++;
				//System.out.print(arr1[j][z]);
			}
			//System.out.println();
		}
		System.out.println(cnt1+cnt);
		

	}
}