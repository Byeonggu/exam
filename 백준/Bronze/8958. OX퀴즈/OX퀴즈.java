import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<N; i++) {
			int num=0;
			int cnt=1;
			String[] str = sc.nextLine().split("");
			for(int j=0; j<str.length; j++) {
				if(str[j].equals("O")) {
					num+=cnt;
					cnt++;
				}else{
					cnt=1;
				}
			}
			sb.append(num +"\n");
		}
		
		System.out.println(sb);
	}
	
}