import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Integer> queue= new PriorityQueue<>();
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			queue.add(sc.nextInt());
		}
		int sum =0;
		if(queue.size()==1) {
			System.out.println(0);
			return;
		}
		while(queue.size()>=2) {
			int a = queue.poll();
			int b = queue.poll();
			sum+=a+b;
			queue.add(a+b);
		}
		
		System.out.println(sum);
	}
}