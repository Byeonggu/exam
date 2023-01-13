import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = A; i <= B;  i++) {
			int flag =0;
			if(i == 2) {
				list.add(i);
			}
			if(i >= 3) {
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j ==0) {
						flag=1;
					}
				}
				if(flag != 1) {
					list.add(i);
				}
			}
		}
		if(list.size()!=0) {
			
			for(int j: list) {
				sum +=j;
			}
			System.out.println(sum);
			System.out.println(list.get(0));
		}else {
			System.out.println(-1);
		}
	}
}