import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int num=0;
		for(int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
			num+=arr[i];
		}
		
		for(int i=1; i<5; i++) {
			if(arr[i-1]>arr[i]) {
				int j=0;
				j=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=j;
				i=0;
			}
		}
		System.out.println(num/5);
		System.out.println(arr[2]);
		

	}
}