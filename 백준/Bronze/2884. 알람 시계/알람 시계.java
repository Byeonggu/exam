import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int minustime = 45;
	if(minustime> min){
			min= 60-(minustime - min);
			if(hour ==0){
				hour = 23;
			}else {
				hour -=1;
			}
		}else if(min>=minustime) {
			min= min - minustime;
		}
		
		
		System.out.print(hour+" " +min);
	}

}