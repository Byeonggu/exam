import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<N; i++) {
			int T = sc.nextInt();
			int[] arr = new int[T];
			double sum=0;
			double sum1=0;
			for(int j=0; j<T; j++) {
				arr[j]=sc.nextInt();
				sum+=arr[j];
			}
			for(int j=0; j<T; j++) {
				if(sum/T <arr[j]) {
					sum1++;
				}
			}
			sb.append(String.format("%.3f", sum1/T*100)+"%\n");
			
		}
		
		System.out.println(sb);
	}
	
}