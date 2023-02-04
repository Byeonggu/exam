import java.util.Scanner;


public class Main {	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();
        long[] arr = new long[(int)N];
        long[] arr2 = new long[(int)M];
        long sum=0;
        for(int i =0; i<N; i++) {
        	arr[i]=sc.nextInt();
        	sum+=arr[i];
        	arr2[(int)(sum%M)]++;
        }
        //System.out.println(Arrays.toString(arr2));
        long cnt =arr2[0];
        for(int i=0; i<M; i++) {
        	cnt+=arr2[i]*(arr2[i]-1)/2;	
        }
        System.out.println(cnt);
	}
	
}