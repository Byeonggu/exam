import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i=0; i<T; i++) {
			arr[i]= sc.nextInt();
		}
		int pCnt=1;
		int mCnt=1;
		int RCnt=0;
		int ACnt=0;
		for(int i=0; i<T-1; i++) {
			if(arr[i]<=arr[i+1]){
				pCnt++;

			}else {
				RCnt = Math.max(RCnt, pCnt);
				pCnt=1;
			}
			
			if(arr[i]>=arr[i+1]){
				mCnt++;
			}else {
				ACnt = Math.max(mCnt, ACnt);
				mCnt=1;
			}
		}
		ACnt = Math.max(mCnt, ACnt);
		RCnt = Math.max(RCnt, pCnt);
		System.out.println(Math.max(ACnt, RCnt));
	}
}