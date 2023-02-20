import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args)  {
		
		
		// 1. Test Case를 받고
		// 2. n번째의 test_case만큼 돌면서 값을 받음.
		// 3. 만약 값이 있으면 stack에 추가시키고, 없으면 pop(마지막으로 추가된 원소를 제거할 것)
		// 4. Loop문이 끝나고 만약 stack에 size가 0이면 값이 없는 것.
		// 5. Loop문 끝나고 남아있는 것들의 합. >> 문제.
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=T; i++) {
			int K = sc.nextInt();
			int num = 0;
			int sum = 0;
			
			for(int j=1; j<=K; j++) {
				num = sc.nextInt();
				if(num == 0) {
					stack.pop();
				}else {
					stack.add(num);
				}
			}
			if(stack.size()==0) {
				System.out.println("#"+i+" "+0);
			}else {
					for(int s=0; s<stack.size(); s++) {
						sum += stack.get(s);
					}
					System.out.println("#"+i+" "+sum);
					
				}
			stack.clear();
		}
		

	}
}
