import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	       Scanner sc =new Scanner(System.in);
	       while(true) {
	    	   int x = sc.nextInt();
	    	   int y = sc.nextInt();
	    	   sc.nextLine();
	    	   if(x==0 && y==0) {
	    		   break;
	    	   }
	    	   if(x<y && y%x==0) {
	    		   System.out.println("factor");
	    	   }else if(x>y && x%y==0){
	    		   System.out.println("multiple");
	    	   }else {
	    		   System.out.println("neither");
	    	   }
	       }
	        
	    }
}