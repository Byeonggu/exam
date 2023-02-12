import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			if(N==0&&M==0) {
				return;
			}else {
				if(N>M) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
	}
}