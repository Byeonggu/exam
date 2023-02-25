import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            Stack<Character> st1 = new Stack<>();
            Stack<Character> st2 = new Stack<>();
            
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j)=='<') {
                    if(!st1.isEmpty())
                        st2.push(st1.pop());
                }else if(str.charAt(j)=='>') {
                    if(!st2.isEmpty())
                        st1.push(st2.pop());
                }else if(str.charAt(j)=='-') {
                    if(!st1.isEmpty())
                        st1.pop();
                }else {
                    st1.push(str.charAt(j));
                }
            }
            
            while(!st2.isEmpty())
                st1.push(st2.pop());
            
            StringBuilder sb = new StringBuilder();
            while(!st1.isEmpty())
                sb.append(st1.pop());
            System.out.println(sb.reverse());
        }
    }

	
}
