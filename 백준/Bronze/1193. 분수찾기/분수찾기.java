import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=1&&a<=10000000){
			int i =1;
			int j=0;
			while(true) {
		
				if(a>j && a<=j+i){
					
					if(i%2==0) {
						System.out.println((a-j)+"/"+(i+1-(a-j)));
						break;
					}else {
						System.out.println((i+1-(a-j))+"/"+(a-j));
						break;
					}
				}
				
				j=i+j;
				i++;
			}
		
		}
	}

}