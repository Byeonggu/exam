import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<testCase; i++){
            String[] arr = br.readLine().split(" ");

            switch(arr[0]){
                case "push":
                    queue.add(Integer.parseInt(arr[1]));
                    break;
                case "front" :
                    if(queue.size()==0) sb.append(-1+"\n");
                    else sb.append(queue.peek()+"\n");
                    break;
                case "pop" :
                    if(queue.size()==0) sb.append(-1+"\n");
                    else sb.append(queue.poll()+"\n");
                    break;
                case "size" :
                    sb.append(queue.size()+"\n");
                    break;
                case "empty" :
                    if(queue.size()==0) sb.append(1+"\n");
                    else sb.append(0+"\n");
                    break;
                case "back" :
                    if(queue.size()==0) sb.append(-1+"\n");
                    else sb.append(queue.peekLast()+"\n");
                    break;
            }

        }
        System.out.println(sb);
    }
}
