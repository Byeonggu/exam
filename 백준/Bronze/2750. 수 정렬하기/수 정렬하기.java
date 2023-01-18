import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i=0; i<T; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=1; i<T; i++) {
			if(arr[i-1]>arr[i]) {
				int j=0;
				j=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=j;
				i=0;
			}
		}
		for(int i: arr) {
			System.out.println(i);
		}
		

	}
}
