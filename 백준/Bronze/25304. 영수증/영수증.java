import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		
		
		int sum1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum2 = 0;
		for(int i =0; i<num2; i++){
			sum2 = sum2+(sc.nextInt()*sc.nextInt());
		}
		if(sum1 == sum2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}