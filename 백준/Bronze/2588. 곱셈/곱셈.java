import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
		System.out.println(m%10*n);
		System.out.println((m%100-m%10)/10*n);
		System.out.println(m/100*n);
		System.out.println(m*n);
	}
	
}