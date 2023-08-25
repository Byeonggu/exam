import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int F = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int G = Integer.parseInt(input[2]);
        int U = Integer.parseInt(input[3]);
        int D = Integer.parseInt(input[4]);
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] visit = new int[F+1];
        queue.add(S);
        visit[S]=1;
        boolean flag = true;
        while(!queue.isEmpty()){
           int currentF = queue.poll();
//            printQueue(queue);
            if(currentF==G){
                System.out.println(visit[currentF]-1);
                flag=false;
                break;
            }

            if(currentF+U<=F
                    &&(visit[currentF+U]==0)){
                queue.add(currentF+U);
                visit[currentF+U]=visit[currentF]+1;
            }

            if(currentF-D>=1
                    &&(visit[currentF-D]==0)){
                queue.add(currentF-D);
                visit[currentF-D]=visit[currentF]+1;
            }
        }

        if(flag) System.out.println("use the stairs");

    }

    public static void printQueue(Queue<Integer> que) {
        Iterator itr = que.iterator();
        while(itr.hasNext()) {
            System.out.println(itr);
        }
    }


}
