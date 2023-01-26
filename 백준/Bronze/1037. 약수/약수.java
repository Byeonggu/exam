import java.util.Arrays;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	       Scanner sc =new Scanner(System.in);
	       int x = sc.nextInt();
	       if(x==1) {
	    	   int y = sc.nextInt();
	    	   System.out.println(y*y);
	       }else {
		       sc.nextLine();
		       String[] str = sc.nextLine().split(" ");
		       int[] arr = new int[str.length];
		       for(int i= 0; i<str.length; i++){
		    	   arr[i]=Integer.parseInt(str[i]);
		       }
		       Arrays.sort(arr);
		       System.out.println(arr[0]*arr[arr.length-1]);
	       }
	    }
}