
import java.util.Scanner;


public class Main {
	public static int N;
	public static int[] arr;
	public static int[] buho= new int[4];
	public static int max=Integer.MIN_VALUE;
	public static int min=Integer.MAX_VALUE;
	public static int cnt=0;
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		for(int i=0; i<N; i++) {
				arr[i]= sc.nextInt();
		}
		for(int i=0; i<4; i++) {
			 buho[i]= sc.nextInt();

		}
		
		
		
		
		dfs(arr[0],1);
		System.out.println(max+"\n"+min);
 
	}
 
	
	
	public static void dfs(int num, int depth) {
		//System.out.println("작동 sum" + sum+" / depth: "+depth);
		if(depth == N){
			//	System.out.println("작동 sum" + sum);
				max=Math.max(max, num);
				min=Math.min(min, num);
				return;
		}
		
			for (int i = 0; i <4; i++){

				if(buho[i]>0) {
					buho[i]--;
					
					
					if(i==0) {
						//num += arr[depth];
						//depth++;
						//dfs(num , depth);
						dfs(num + arr[depth], depth+1);
					}else if(i==1) {
						//num -= arr[depth];
						//depth++;
						//dfs(num , depth);
						dfs(num- arr[depth], depth+1);
					}else if(i==2) {
						//num *= arr[depth];
						//depth++;
						//dfs(num , depth);
						dfs(num* arr[depth], depth+1);
					}else if(i==3) {
						//num /= arr[depth];
						//depth++;
						//dfs(num , depth);
						dfs(num/ arr[depth], depth+1);
					}
					
					
					buho[i]++;
				}
			}
		
		
	}
	
 
}