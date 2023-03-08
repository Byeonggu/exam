import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr = br.readLine();
		String bomb = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<arr.length(); i++){
			stack.push(arr.charAt(i)) ;
			if(stack.size()>=bomb.length()){
				
				boolean flag = true;
				for(int j=0; j<bomb.length(); j++){
					if(stack.get(stack.size()-bomb.length()+j)!=bomb.charAt(j)) {
						flag=false;
						break;
					}
				}
				if(flag) {
					for(int j=0; j<bomb.length(); j++) {
						stack.pop();
					}
				}
				
			}
		}
		StringBuilder sb = new StringBuilder();
		if(stack.size()==0) {
			sb.append("FRULA");
		}else {
			for(char s : stack) {
				sb.append(s);
			}
		}
		System.out.println(sb);
		
	}

}