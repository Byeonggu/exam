import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[T];
		int[] countArr= new int[N];
		int max=0;
		int idy=-1;
		for(int i=0; i<N; i++) {
			int p=sc.nextInt();
			int k=sc.nextInt();
			if(k-p+1>max) {
				max=k-p+1;
				idy=i+1;
			}
			for(int j=p-1; j<k; j++) {
				if(arr[j]==0) {
					arr[j]=i+1;
					countArr[i]++;
				}
			}
		}
		max=0;
		int idx=-1;
		for(int i=0; i<N; i++) {
			if(countArr[i]>max){
				max=countArr[i];
				idx=i+1;
			}
		}
		System.out.println(idy);
		System.out.println(idx);
		
		
	}
}