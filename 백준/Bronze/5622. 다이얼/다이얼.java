import java.util.Scanner;

public class Main {
	public static String[] alphabet= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static int[] arr= {3, 4, 5, 6, 7, 8, 9, 10, 10};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str =sc.nextLine().toLowerCase().split("");
		int sum =0;
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<alphabet.length; j++) {
				if(str[i].equals(alphabet[j])) {
					if(alphabet[j].equals("s")) {
						sum+=arr[j/3]-1;
					}else if(alphabet[j].equals("v")) {
						sum+=arr[j/3]-1;
					}else{
						sum+=arr[j/3];
					}
					
				}
			}
		}
		System.out.println(sum);

	}
	
}