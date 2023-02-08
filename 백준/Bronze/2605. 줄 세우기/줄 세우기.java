import java.util.ArrayList;
import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> line = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(num!=0) {
				line.add(i-num, i+1);
			}else {
				line.add(i+1);
			}
			
		}
		
		for(int i : line) {
			System.out.print(i+" ");
		}
		
	}
}