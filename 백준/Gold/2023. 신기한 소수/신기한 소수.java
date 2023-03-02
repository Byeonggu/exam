import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Queue<String> qu = new LinkedList<>();
		qu.add("2");
		qu.add("3");
		qu.add("5");
		qu.add("7");
		
		while(qu.peek().length()!=N) {
			String str = qu.poll();
			for(int i=1; i<=9; i+=2) {
				long num = Long.parseLong(str+i);
//				System.out.println(num);
				if(isPrime(num)==1) {
					qu.add(Long.toString(num));
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!qu.isEmpty()) {
			sb.append(qu.poll()+"\n");
		}
		
		System.out.println(sb);
		
		
	}
	public static int isPrime(long n) {
		for (long i = 2; i<=(long)Math.sqrt(n); i++) {
	      if (n % i == 0) {
	          return 0;
	      }
		}
		return 1;
	}
	
 
}