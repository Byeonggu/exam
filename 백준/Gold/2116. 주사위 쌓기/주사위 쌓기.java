
import java.util.Scanner;


public class Main {
	static int[][] arr;
	static int max=0;
	static int N;
	static int cnt=0;
	
	public static int findTop(int num, int deepth) {
		int result=0;
		for(int i=0; i<6; i++) {
			
			if(arr[deepth][i]==num) { 
				switch (i) {
				case 0:
					result=arr[deepth][5];
					break;
				case 1:
					result=arr[deepth][3];
					break;
				case 2:
					result=arr[deepth][4];
					break;
				case 3:
					result=arr[deepth][1];
					break;
				case 4:
					result=arr[deepth][2];
					break;
				case 5:
					result=arr[deepth][0];
					break;
				}
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N][6];
		for(int i=0; i<N; i++) {
			for(int j=0; j<6; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<6; i++) {
			
			fnc(arr[0][i], 0, 0);
		
		}
		System.out.println(max);
	}
	
	public static void fnc(int num, int deepth, int sum) {
		if(deepth==N) {
			max=Math.max(sum, max);
			//System.out.println((cnt++)+" : "+sum);
			return;
		}
		int top = findTop(num, deepth);
		if(num != 6 && top !=6) {
			fnc(top, deepth+1, sum+6);
		}else if(num+top==11) {
			fnc(top, deepth+1, sum+4);
		}else if(num == 6 || top ==6) {
			fnc(top, deepth+1, sum+5);
		}
		
	}

		
		
	
}