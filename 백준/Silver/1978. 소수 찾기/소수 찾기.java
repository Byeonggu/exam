import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int result =T;
		for(int i = 0; i <T;  i++) {
			int num = sc.nextInt();
			int flag =0;
			if(num<2) {
				result -=1;
			}
			
			if(num >= 3) {
				for(int j=2; j<=Math.sqrt(num); j++) {
					if(num%j ==0) {
						flag=1;
					}
				}
			if(flag==1) {
				result -=1;
			}
			}
		}
		System.out.println(result);
	}
}