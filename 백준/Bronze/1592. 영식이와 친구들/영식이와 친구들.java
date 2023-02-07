import java.util.Scanner;

public class Main {
	static int[] arr;
	static int M;
	static int L;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		
		arr = new int[N];
		
		toss(0, 0);
	}
	
	public static void toss(int i, int cnt) {
		if(i>=N) {
			i=i%N;
		}else if(i<0) {
			i=N-Math.abs(i%N);
		}
		
		arr[i]++;
		if(arr[i]==M) {
			System.out.println(cnt);
			//System.out.println(Arrays.toString(arr));
			return;
		}
		if(arr[i]%2!=0){
			toss(i+L, cnt+1);
		}else {
			toss(i-L, cnt+1);
		}
	}
}