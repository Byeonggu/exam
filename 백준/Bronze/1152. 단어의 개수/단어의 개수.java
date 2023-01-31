import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] str = st.split("");
		int cnt =0;
		int blank=0;
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(" ")) {
				blank++;
			}
		}
		
		String start = st.substring(0,1);
		String end = st.substring(st.length()-1,st.length());
		
		if(start.equals(" ")&& end.equals(" ")) {
			System.out.println(blank-1);
		}else if(start.equals(" ")) {
			System.out.println(blank);
		}else if(end.equals(" ")) {
			System.out.println(blank);
		}else {
			System.out.println(blank+1);
		}
		
	}
	
}