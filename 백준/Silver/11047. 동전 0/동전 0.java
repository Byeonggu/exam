import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coins= new int[N];
        for(int i=0; i<N; i++) {
        	coins[i]=sc.nextInt();
        }
        int cnt =0;
        for(int i=N-1; i>=0; i--) {
        	if(K/coins[i]>=1) {
        		int num =K/coins[i];
        		K-=num*coins[i];
        		cnt+=num;
        	}
        	if(K==0) {
        		break;
        	}
        	
        }
        System.out.println(cnt);
    }
}


	