import java.util.Scanner;


public class Main {	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int[] sum= new int[M+1];
        for(int i=1; i<=M; i++) {
        	sum[i]=sc.nextInt()+sum[i-1];
        }
       // System.out.println(Arrays.toString(sum));
        int result = 0;
        int a;
        int b;
        for(int i=0; i<T; i++) {
        	a=sc.nextInt();
        	b=sc.nextInt();
        	result=sum[b]-sum[a-1];
        	sb.append(result+"\n");
        }
        
        System.out.println(sb);
        
	}
	
}