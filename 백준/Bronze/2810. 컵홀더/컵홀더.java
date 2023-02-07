
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		
//		System.out.println(N+" : "+ str);
		int num =str.length();
		if(str.contains("LL")) {
			str=str.replaceAll("LL", "S");
			int num1 = str.length();
			System.out.println(num1+1);
		}else {
			System.out.println(N);
		}
	
	}
	
	
}