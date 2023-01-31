import java.util.Scanner;

public class Main {
	public static String[] alphabet= {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		for(int i=0; i<alphabet.length; i++) {
			str=str.replaceAll(alphabet[i], "1");
		}
		
		int sum =0;
		
		System.out.println(str.length());

	}
	
}