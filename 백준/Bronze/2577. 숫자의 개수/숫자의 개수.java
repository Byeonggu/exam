import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String[] str = Integer.toString(A*B*C).split("");
		int[] count = new int[10];
		
		for(int i=0; i<str.length; i++) {
			count[Integer.parseInt(str[i])]++;
		}
		for(int c : count) {
			System.out.println(c);
		}
	}


}