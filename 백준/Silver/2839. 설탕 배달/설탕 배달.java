import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int x = num/5;
		int y = 0;
		
		while(true) {
			if((num>=5 || num ==3)&& num!=7) {
				if(num%5 ==3) {
					y=1;
					break;
				}
				
				if(num ==  5*x + 3*y) {
					break;
				}else {
					if((num-(5*x))%3==0) {
						y=(num-(5*x))/3;
					}else if((num-(5*x))%3==1) {
						y= 2;
						x= (num-3*y)/5;
					}else if((num-(5*x))%3==2) {
						y= 4;
						x= (num-3*y)/5;
					}else if((num-(5*x))%3==4) {
						y= 3;
						x= (num-3*y)/5;
					}
				}
				
			}else {
				x=-1;
				y=0;
				break;
			}
		}
		System.out.println(x+y);
		
	}

}