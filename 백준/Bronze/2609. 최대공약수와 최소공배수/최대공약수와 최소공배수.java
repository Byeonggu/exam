import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int num=2;
		int min=1;
		int max=1;
		while(num<=a&&num<=b) {
			if(a%num ==0&&b%num==0) {
				a/=num;
				b/=num;
				min*=num;
				max*=num;
				
				
			}else {
				num++;
			}
		}
		
		min *=a*b;
		System.out.println(max);
		System.out.println(min);
		
		
		
		
	}
}