import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int N=sc.nextInt();
        sc.nextLine();
        String input;
        for(int i= 0; i<N; i++) {
        	input=sc.nextLine();
        	StringTokenizer st = new StringTokenizer(input);
        	switch (st.nextToken()) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				try {
					sb.append(stack.pop()+"\n");
				} catch (EmptyStackException e) {
					// TODO Auto-generated catch block
					sb.append(-1+"\n");
				}
				break;
			case "size":
				sb.append(stack.size()+"\n");
				break;	
			case "empty":
				if(stack.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
				
				break;	
			case "top":
				if(stack.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stack.peek()+"\n");
				}
				break;	
			
			}
        }
        
        System.out.println(sb);
        
	}
	
}