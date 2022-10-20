import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int spay = sc.nextInt();
		int cpay = sc.nextInt();
		int pay = sc.nextInt();
		if(pay<=cpay) {
			System.out.println(-1);
		}else{
		int bpoint = spay/(pay-cpay) +1;
		System.out.println(bpoint);
		}
		
	}

}
