import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] map = new int[100001];
        boolean[] visit = new boolean[100001];
  
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(N);
        visit[N]= true;
        
        while(!qu.isEmpty()) {
        	int tmp = qu.poll();
//        	System.out.println(tmp + " "+ K);
        	if(tmp == K) {
        		
        		break;
        	}
        	
        	if(tmp+1<=100000 && !visit[tmp+1]) {
        		visit[tmp+1]= true;
        		map[tmp+1]=map[tmp]+1;
        		qu.add(tmp+1);
        		
        	}
        	if(tmp-1>=0 && !visit[tmp-1]) {
        		visit[tmp-1]= true;
        		map[tmp-1]=map[tmp]+1;
        		qu.add(tmp-1);
        	}
        	if(tmp*2<=100000 && !visit[tmp*2]) {
        		visit[tmp*2]= true;
        		map[tmp*2]=map[tmp]+1;
        		qu.add(tmp*2);
        	} 
        	
        }
//        for(int i=0; i<20; i++) {
//        	System.out.print(map[i]+" ");
//        }
        System.out.println(map[K]);
        //System.out.println(result);
	}

    

}