import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	static String[] str1;
	static String[] str2;
	static int a;
	static int b;
	static int num =0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str1= br.readLine().split("");
		str2= br.readLine().split("");
		int max= 0;
		int[][] arr = new int[str1.length+1][str2.length+1];
		for(int i=0; i<str1.length; i++) {
			for(int j=0; j<str2.length; j++) {
				if(str1[i].equals(str2[j])) {
					arr[i+1][j+1]=arr[i][j]+1;
					max=Math.max(max, arr[i+1][j+1]);
				}
			}
		}
		
        System.out.println(max);
	}
	

}