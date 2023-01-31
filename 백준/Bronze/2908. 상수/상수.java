import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String[] strA = Integer.toString(A).split("");
		String[] strB = Integer.toString(B).split("");
		
		A=Integer.parseInt(strA[2]+strA[1]+strA[0]);
		B=Integer.parseInt(strB[2]+strB[1]+strB[0]);
		if(A>B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
		
		
	}
	
}