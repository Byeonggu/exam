import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split("");
		int[] arr = new int[str1.length];
		for(int i=0; i<str1.length; i++) {
			arr[i]=Integer.parseInt(str1[i]);
		}
		
		for(int i=1; i<str1.length; i++) {
			if(arr[i-1]<arr[i]) {
				int j=0;
				j=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=j;
				i=0;
			}
		}
		for(int i: arr) {
			System.out.print(i);
		}
		

	}
}