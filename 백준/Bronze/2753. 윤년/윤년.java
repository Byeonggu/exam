import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		
		if(num1%100 !=0){
			if(num1%4 == 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			
		}else if(num1%400 ==0){
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}

}
