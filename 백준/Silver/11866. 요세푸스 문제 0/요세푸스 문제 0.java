import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		sb.append("<");
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		int cnt=1;
		while(queue.size()!=0){
			int tmp = queue.poll();
			if(cnt%K==0) {
				
				if(queue.size()==0) {
					sb.append(tmp);
				}else {
					sb.append(tmp+", ");
				}
			}else {
				queue.add(tmp);
			}
			cnt++;
		}
		
	//	sb.deleteCharAt(sb.length() - 2);
		sb.append(">");
		System.out.println(sb);
		
	}

}