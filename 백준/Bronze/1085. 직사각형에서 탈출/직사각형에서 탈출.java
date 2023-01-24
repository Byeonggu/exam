import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int W=sc.nextInt();
		int H=sc.nextInt();
		
		int min =1000;
		
		if(W/2+1>X) {
			min= Math.min(Math.abs(0-X), min);
		}else {
			min= Math.min(Math.abs(W-X), min);
		}
		if(H/2+1>Y) {
			min= Math.min(Math.abs(0-Y), min);
		}else {
			min= Math.min(Math.abs(H-Y), min);
		}
		System.out.println(min);
		
	}	
	
}