import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		int num = 0;
		int sum = 0;
		
		for(int i=1; i<=T; i++) {
			
			num = sc.nextInt();
			if(num == 0) {
				stack.pop();
			}else {
				stack.add(num);
			}
			
		}
		
		if(stack.size()==0) {
			System.out.println(0);
		}else {
				for(int s=0; s<stack.size(); s++) {
					sum += stack.get(s);
				}
				System.out.println(sum);
				
			}
		
		stack.clear();
		

	}
}
