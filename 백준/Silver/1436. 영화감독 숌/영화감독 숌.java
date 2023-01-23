import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> resultArr = new ArrayList<Integer>();
		for(int i =666; i<Integer.MAX_VALUE; i++) {
			if(Integer.toString(i).contains("666")) {
				resultArr.add(i);
			}
			if(resultArr.size()==N)break;
		}

		System.out.println(resultArr.get(N-1));
	}	
	
	
}