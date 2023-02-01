import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int result=N;
		for(int i=0; i<N; i++) {
			boolean flag=false;
			String[] str =sc.nextLine().split("");
			int cnt =0;
			boolean alphabet[] = new boolean[26];
			for(int j=0; j<str.length-1; j++) {
					if(!str[j].equals(str[j+1])) {
						if(alphabet[str[j+1].charAt(0)-97]==true) {
							result--;
							break;
						}

					}
					alphabet[str[j].charAt(0)-97]=true;
				
			}
			
		}
		
		System.out.println(result);

	}
}