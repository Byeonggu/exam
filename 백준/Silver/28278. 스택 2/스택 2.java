import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int tmp = Integer.parseInt(br.readLine());
        for(int i=0; i<tmp; i++){
            String[] order = br.readLine().split(" ");

            switch (order[0]){
                case "1" :
                    stack.push(Integer.parseInt(order[1]));
                    break;

                case "2":
                    if(!stack.isEmpty())System.out.println(stack.pop());
                    else System.out.println(-1);
                    break;

                case "3":
                    System.out.println(stack.size());
                    break;

                case "4":
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;

                case "5":
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;

            }


        }

    }
}