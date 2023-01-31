import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			int T = sc.nextInt();
			String[] str = sc.nextLine().split("");
			for(int j=1; j<str.length; j++) {
				for(int z=0; z<T; z++) {
					sb.append(str[j]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
		
	}
	
}