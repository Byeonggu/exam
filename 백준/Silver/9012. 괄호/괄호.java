import java.util.Scanner;
import java.util.Stack;

public class Main {	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<String> stack1 = new Stack<String>();
        
        int N= sc.nextInt();
        sc.nextLine();
        for(int i=0; i<N; i++) {
        	int a=0;
            int b=0;
        	String[] str = sc.nextLine().split("");

        	for(int j=0; j<str.length; j++) {
        		if(str[j].equals("("))
	        		stack1.push("(");
	        	else if(!stack1.isEmpty() &&stack1.peek().equals("("))
	        		stack1.pop();
	        	else
	        		stack1.push(")");
        	}

        	if(stack1.isEmpty()) sb.append("YES\n");
        	else sb.append("NO\n");
        	stack1.clear();
        }
        System.out.println(sb);
       
	}
	

}