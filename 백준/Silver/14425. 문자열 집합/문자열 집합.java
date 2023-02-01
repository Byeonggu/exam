import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt =0;
		sc.nextLine();
		Set<String> s1= new HashSet<>();
		for(int i=0; i<N; i++) {
			s1.add(sc.nextLine());
		}
		List<String> s2= new ArrayList<String>();
		for(int i=0; i<M; i++) {
			s2.add(sc.nextLine());
		}
		for(int i=0; i<M; i++) {
			if(s1.contains(s2.get(i))){
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
 
}
