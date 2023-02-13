import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<Integer> testQ = new LinkedList<Integer>();
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int back = 0;
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
			case "push":
				int temp = Integer.parseInt(st.nextToken());
				testQ.add(temp);
				back=temp;
				break;

			case "pop":
				int num;
				if(testQ.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					num = testQ.poll();
					sb.append(num+"\n");
				}
				break;
				
			case "size":
				sb.append(testQ.size()+"\n");
				break;

			case "empty":
				if(testQ.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
				break;

			case "front":
				if(testQ.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(testQ.peek()+"\n");
				}
				
				break;
				
			case "back":
				if(testQ.isEmpty()) {
					sb.append(-1+"\n");
					break;
				}
				sb.append(back+"\n");
				
				break;

			}
			
		}

		System.out.println(sb);
	}
}