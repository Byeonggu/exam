import java.util.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		
		
		int king = 1 -sc.nextInt();
		int queen = 1 -sc.nextInt();
		int rook = 2 -sc.nextInt();
		int bishop =2 -sc.nextInt();
		int knight =2 -sc.nextInt();
		int pawn =8 -sc.nextInt();
		
		String result = king+" "+queen+" "+rook+" "+bishop+" "+knight+ " " +pawn;
		System.out.print(result);
	}

}