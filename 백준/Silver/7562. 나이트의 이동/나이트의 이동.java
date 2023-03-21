import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] 맵;
	static boolean[][] 방문;
	static int[] 델타엑스 = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int[] 델타와이 = {1, 2, 2, 1, -1, -2, -2, -1};
	static int 맵크기;
    public static void main(String[] args) throws IOException{
        BufferedReader 버퍼 = new BufferedReader(new InputStreamReader(System.in));
        int 테스트케이스수 = Integer.parseInt(버퍼.readLine());
        StringBuilder 빌더 = new StringBuilder();
        for(int 테스트케이스 = 0; 테스트케이스<테스트케이스수; 테스트케이스++) {
        	맵크기 = Integer.parseInt(버퍼.readLine());
        	맵= new int[맵크기][맵크기];
        	방문 = new boolean[맵크기][맵크기];
        	StringTokenizer 토큰 = new StringTokenizer(버퍼.readLine());
        	int[] 나이트 = new int[2];
        	나이트[0]= Integer.parseInt(토큰.nextToken());
        	나이트[1]= Integer.parseInt(토큰.nextToken());
        	
        	토큰 = new StringTokenizer(버퍼.readLine());
        	int[] 목적지 = new int[2];
        	목적지[0]= Integer.parseInt(토큰.nextToken());
        	목적지[1]= Integer.parseInt(토큰.nextToken());
        	Queue<Integer> 큐 = new LinkedList<Integer>();
        	큐.add(나이트[0]);
        	큐.add(나이트[1]);
        	while(!(큐.isEmpty())) {
        		int 엑스 = 큐.poll();
        		int 와이 = 큐.poll();
        		if(목적지[0]== 엑스 && 목적지[1]==와이) {
        			빌더.append(맵[엑스][와이]+"\n");
        			break;
        		}
        		
        		방문[엑스][와이]=true;
        		for(int 인 =0; 인<델타엑스.length; 인++) {
        			int 뉴엑스 =엑스 + 델타엑스[인];
        			int 뉴와이 =와이 + 델타와이[인];
        			
        			if(뉴엑스>=0 && 뉴엑스 <맵크기 && 뉴와이 >=0 && 뉴와이 <맵크기 && !방문[뉴엑스][뉴와이]) {
        				맵[뉴엑스][뉴와이]=맵[엑스][와이]+1;
        				방문[뉴엑스][뉴와이]=true;
        				
        				큐.add(뉴엑스);
        	        	큐.add(뉴와이);
        			}
        		}
        		
        	}
        	
        }
        System.out.println(빌더);
        
	}

}