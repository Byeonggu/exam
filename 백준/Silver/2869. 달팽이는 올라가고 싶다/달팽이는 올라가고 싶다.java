import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int result=(v-b)%(a-b);
		if(result!=0) {
			System.out.println((v-b)/(a-b)+1);
		}else{
			System.out.println((v-b)/(a-b));
		}
		
	}

}