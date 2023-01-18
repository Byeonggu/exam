import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=1; i<N; i++) {
			if(arr[i-1]<arr[i]) {
				int j=0;
				j=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=j;
				i=0;
			}
		}
		System.out.println(arr[k-1]);
		

	}
}