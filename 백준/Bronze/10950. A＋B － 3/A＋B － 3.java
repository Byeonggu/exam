import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<t; i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			sb.append(n+m + "\n");
		}
		System.out.println(sb);
			
	}
}
