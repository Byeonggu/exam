import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		
		for(int i=0; i<T; i++) {
			
			boolean flag = false;
			String word = sc.next();
			String[] arr = new String[word.length()];
			
			arr = word.split("");
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals(arr[arr.length-1-j])) {
					flag = true;
				}else flag = false;

			}
			if(flag == true) {
				System.out.println("#"+(i+1)+" "+"1");
			} else {
				System.out.println("#"+(i+1)+" "+"0");
			}
			
			
			
		} 
		

		
	}
}
