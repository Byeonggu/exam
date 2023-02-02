import java.util.Scanner;

public class Main {
	static String[][] map;
	static int T;
	static int N;
	static boolean start;
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        N = sc.nextInt();
        start=false;
        if(N/2==0) {
        	start=true;
        }
       
        sc.nextLine();
        map =new String[T][N];
        int cnt =Integer.MAX_VALUE;
        for(int t = 0; t<T; t++) {
        	map[t]=sc.nextLine().split("");
        }
        for(int i=0; i<T-7; i++) {
        	for(int j=0; j<N-7; j++) {
        		int num=Math.min(check("W",i,j),check("B",i,j));
        		cnt=Math.min(cnt, num);
        	}
       
        }
        System.out.println(cnt);
        
    
    
	}  
	
	public static int check(String start, int x, int y) {
		int cnt=0;
		int flag=0;
		String other;
		if(start.equals("W")) {
			other="B";
		}else {
			other="W";
		}
		 for(int i=x; i<x+8; i++) {
	        	for(int j=y; j<y+8; j++) {
	        		if(i%2==0) {
		        		if(map[i][j].equals(start)&&j%2==0) {
		        			continue;
		        		}else if(map[i][j].equals(other)&&j%2==0){
		        			//System.out.println(i+" "+ j);
		        			cnt++;
		        			continue;
		        		}else if(map[i][j].equals(start)) {
		        			cnt++;
		        			continue;
		        		}
	        		}else if(i%2!=0) {
	        			if(map[i][j].equals(start)&&j%2!=0) {
		        			continue;
		        		}else if(map[i][j].equals(other)&&j%2!=0){
		        			//System.out.println(i+" "+ j);
		        			cnt++;
		        			continue;
		        		}else if(map[i][j].equals(start)) {
		        			cnt++;
		        			continue;
		        		}
	        		}
	        	}
	        }
		
		 
		 
		 return cnt;
	}

	
}