import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int cnt =0;
		for(int i=1; i<=T; i++) {
			boolean t = fnc(i);
			if(t) {
				cnt++;
			}
		}
		System.out.println(cnt);
	
	}
	public static boolean fnc(int a) {
		if(a<100)return true;
		
		boolean b = false;
		String[] str= Integer.toString(a).split("");
		
		
		int gab=Integer.parseInt(str[1])-Integer.parseInt(str[0]);
		for(int i=0; i+1<str.length; i++) {
			
			if(Integer.parseInt(str[i+1])-Integer.parseInt(str[i])==gab) {
				b= true;
			}else {
				b=false;
			}
		}
		return b;
	}
}