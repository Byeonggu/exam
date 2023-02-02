import java.util.Scanner;

public class Main {
	static String[][] map;
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] arr =new int[T][2];
        int[] rank =new int[T];
        for(int t = 0; t<T; t++) {
        	arr[t][0]=sc.nextInt();
        	arr[t][1]=sc.nextInt();
        }
        
        for(int i=0; i<T; i++) {
        	int cnt=1;
        	for(int j=0; j<T; j++) {
        		if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) {
        			cnt++;
        		}
        		rank[i]=cnt;
        	}
        }
        
        for(int i : rank) {
        	System.out.print(i+" ");
        }
    
    
	}    

	
}