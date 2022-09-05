import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cooktime = sc.nextInt();
		if(min + cooktime >= 60){
			hour += 1;
			min = min + cooktime - 60;
			while(min>= 60) {
				hour += 1;
				min = min-60;
				if(min<60) {
					break;
				}
			}
			
			if(hour>=24){
				hour= hour-24;
			}
		}else {
			min= min + cooktime;
		}
		
		
		System.out.print(hour+" " +min);
	}

}