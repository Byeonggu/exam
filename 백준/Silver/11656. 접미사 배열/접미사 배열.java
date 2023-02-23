import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		StringBuilder sb = new StringBuilder();
		String[] result=new String[str.length];
		for(int j=0; j<str.length; j++) {
			for(int i=j; i<str.length; i++) {
				sb.append(str[i]);
			}
			result[j]= sb.toString();
			sb.delete(0, sb.length());
		}
		Arrays.sort(result);
		for(String d: result) {
			System.out.println(d);
		}
	}

}