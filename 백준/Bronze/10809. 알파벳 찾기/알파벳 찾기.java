import java.util.Scanner;

public class Main {
	public static String[] alphabet= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		outer:for(int i=0; i<alphabet.length; i++) {
			for(int j=0; j<str.length; j++){
				if(str[j].equals((alphabet)[i])){
					System.out.print(j +" ");
					continue outer;
				}
			}
			System.out.print(-1+" ");
		}
		
		
	}
	
}