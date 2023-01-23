import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer> resultArr = new ArrayList<Integer>();
		int[] arr= new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int z=j+1; z<arr.length; z++) {
					int result=0;
					result+=arr[i];		
					result+=arr[j];
					result+=arr[z];
					if(result<=M) {
						resultArr.add(result);	
					}
				}
			}
			
		}
		Collections.sort(resultArr);
		System.out.println(resultArr.get(resultArr.size()-1));
		
	}	
	
	
}