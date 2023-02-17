import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		String[] arr = num.split("");
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		int idx = 0;
		int max = 0;
		int tmp = 0;
		
		for(int i=0; i<arr2.length-1; i++) {
			for(int j=i+1; j<arr2.length; j++) {
				if(arr2[i] < arr2[j]) {
					tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
			
		}
		for(int x=0; x<arr2.length; x++) {
			System.out.print(arr2[x]);
		}
	}//
}//
