import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> resultArr = new ArrayList<Integer>();
		if(N< 10) {
			if(N%2 ==0) {
				resultArr.add(N/2);
			}else {
				resultArr.add(0);
			}
			
		}else {
		
			for(int i=10; i<N; i++) {
				int result =i;
				String[] arr = Integer.toString(i).split("");
				for(String str : arr) {
					result+= Integer.parseInt(str);
				}
				if(result == N) {
					resultArr.add(i);
				}
			}
		}
		
		if(resultArr.size()>0) {
			Collections.sort(resultArr);
			System.out.println(resultArr.get(0));
		}else {
			System.out.println(0);
		}
	}	
	
	
}