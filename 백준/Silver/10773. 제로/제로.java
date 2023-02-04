import java.util.Scanner;
import java.util.Stack;

public class Main {	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int N= sc.nextInt();
        for(int i=0; i<N; i++) {
        	int num =sc.nextInt();
        	if(num==0) {
        		stack.pop();
        	}else {
        		stack.push(num);
        	}
        	//System.out.println(i);
        	
        }
        //System.out.println(stack);
        int sum=0;
        while(!stack.isEmpty()) {
        	//System.out.println(1);
        	sum+=stack.pop();
        }
        System.out.println(sum);
	}
	

}