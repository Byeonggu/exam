import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=1&&a<=1000000000){
			int i =1;
			int j=1;
			while(true) {
				if(a == 1) {
					System.out.println(1);
					break;
				}
				
				if(a>=i+1 && a<=i+j*6) {
					System.out.println(j+1);
					break;
				}
				i=i+j*6;
				j++;
			}
		
		}
	}

}