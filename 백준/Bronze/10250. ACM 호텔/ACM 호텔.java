import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i =1; i<=t; i++) {
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int room1 = 1;
			int room2 = 1;
			int num = 1;
			while(true) {
				if(n==num) {
					if(room2<10) {
						sb.append(room1+"0"+room2+"\n");
					}else {
						sb.append(room1+""+room2+"\n");
					}
					break;
				}
				if(h==room1) {
					room2++;
					room1=1;
				}else {
					room1++;
				}
				
				num++;				
			}	
			
		}
		System.out.println(sb);
			
	}
}