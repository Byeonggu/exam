import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] time = new int[N];
        int[] sum = new int[N+1];
        for(int i=0; i<N; i++){
        	time[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(time);
        int num=0;
        for(int i=1; i<=N; i++) {
        	sum[i]=time[i-1]+sum[i-1];
        	num+=sum[i];
        }
        System.out.println(num);
        
        
	}
	
}