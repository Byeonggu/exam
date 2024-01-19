import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        Queue<Integer> qu = new LinkedList<Integer>();
        for(String s : str){
            qu.add(Integer.parseInt(s));
        }
        Stack<Integer> stack = new Stack<>();
        int tmp = 1;
        boolean flag = true;
        while(!qu.isEmpty()){
            if(qu.peek()==tmp){
                tmp++;
                qu.poll();
            }
            else if(!stack.isEmpty() && stack.peek()==tmp){
                stack.pop();
                tmp++;
            }
            else {
                stack.push(qu.poll());
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek()==tmp){
                stack.pop();
                tmp++;
            }else{
                flag=false;
                break;
            }
        }
        if(flag) System.out.println("Nice");
        else System.out.println("Sad");
    }
}