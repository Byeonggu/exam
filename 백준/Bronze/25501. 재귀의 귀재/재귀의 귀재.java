import java.util.Scanner;

public class Main {
	public static int cnt =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<N; i++) {
			String s= sc.nextLine();
			if(isPalindrome(s)==1) {
				sb.append("1 "+cnt+"\n");
			}else {
				sb.append("0 "+cnt+"\n");
			}
			cnt=0;
		}
		System.out.println(sb);

	}
	
	
	public static int recursion(String s, int l, int r){
		cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
	
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
   
}
