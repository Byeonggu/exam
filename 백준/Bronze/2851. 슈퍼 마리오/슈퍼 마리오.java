import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int mushroom[] = new int[10];
		int dp[] = new int[11];
		int min =Integer.MAX_VALUE;
		int sum =0;
		for(int i=0; i<10; i++) {
			mushroom[i]=sc.nextInt();
			sum+= mushroom[i];
			min=Math.min(Math.abs(sum-100), min);
		}
		int result=0;
		for(int i=1; i<11; i++) {
			dp[i]=dp[i-1]+mushroom[i-1];
			if(Math.abs(dp[i]-100)==min){
				result=dp[i];
			}
		}
		System.out.println(result);
	}
}