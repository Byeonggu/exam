import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static String[][] map;
	static Queue<Integer> queue = new LinkedList<>();
	static Queue<String> queue2 = new LinkedList<>();
	
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
	static int N;
	static int[] dx= { 0, 1};
	static int[] dy= { 1, 0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		map = new String[N][N];
		for(int i=0; i<N; i++) {
			map[i]=sc.nextLine().split(" ");
		}
		for(String[] s : map) {
		}
		
		fnc(0, 0, 0, 0);
		
		System.out.println(max+" "+min);
	}

	
	public static void fnc(int x, int y, int num, int deepth) {
		int temp=0;
		if(deepth%2 !=0) {
			queue2.add(map[x][y]);
			temp=num;
		}else {
			temp = Integer.parseInt(map[x][y]);
		}
		int result=0;
		if(deepth != 0&& deepth%2==0){
			int a= num;
			int b= temp;

			String mark = queue2.poll();

			switch (mark) {
				case "+":
					result=a+b;

					break;
				case "-":
					result=a-b;

					break;
				case "*":
					result=a*b;

					break;
			}
			
			temp=result;
		}
	
		if(x==N-1 && y==N-1) {
			max = Math.max(max, temp);
			min = Math.min(min, temp);
			return;
		}
		
		
		for(int i=0; i<2; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			if(newX<N && newX>=0 && newY<N && newY>=0) {
				if(queue2.size()==0&&deepth%2 !=0&&i==1) {
					queue2.add(map[x][y]);
				}
				fnc(newX, newY, temp, deepth+1);
			}
		}
	}
}