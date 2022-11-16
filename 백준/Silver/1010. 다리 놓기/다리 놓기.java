import java.math.BigInteger;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<t; i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			
			BigInteger mnum = new BigInteger("1");
			BigInteger nnum = new BigInteger("1");
			for(int j=(m-n)+1; j<=m; j++) {
				String jstr= String.valueOf(j);
				BigInteger jnum = new BigInteger(jstr);
				mnum = mnum.multiply(jnum);
			}
			for(int j=1; j<=n; j++) {
				String jstr= String.valueOf(j);
				BigInteger jnum = new BigInteger(jstr);
				nnum = nnum.multiply(jnum);
			}
			sb.append(mnum.divide(nnum)+"\n");
			
		}
		System.out.println(sb);
	}
	

}