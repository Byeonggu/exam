import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	int[] arr = new int[3];
		while(true) {
			arr[0]=sc.nextInt();
			arr[1]=sc.nextInt();
			arr[2]=sc.nextInt();
			if(arr[0]+arr[1]+arr[2]==0)break;
			Arrays.sort(arr);
			arr[0]*=arr[0];
			arr[1]*=arr[1];
			arr[2]*=arr[2];
			if(arr[2]==(arr[0]+arr[1])) {
				sb.append("right"+"\n");
			}else {
				sb.append("wrong"+"\n");
			}
			
		}
		System.out.println(sb);
	}
}