import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<String> stack;
		while(true){
			stack= new Stack<>();
			String st = sc.nextLine();
			if(st.equals("."))break;
			String[] str = st.split("");
			for(String s: str) {
				if(s.equals("(")||s.equals("[")){
					stack.add(s);
				}
				
				if(!stack.isEmpty()&&s.equals(")")&&stack.peek().equals("(")) {
					stack.pop();
				}else if(!stack.isEmpty()&&s.equals("]")&&stack.peek().equals("[")) {
					stack.pop();
				}else if(s.equals(")")||s.equals("]")) {
					stack.add(s);
				}
			}
			if(stack.size()==0) {
				sb.append("yes\n");
			}else {
				sb.append("no\n");
			}
			
		}
		
		System.out.println(sb);
	}

}