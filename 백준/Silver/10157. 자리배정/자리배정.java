import java.util.Scanner;

public class Main {
	static int target;
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int M = sc.nextInt();
        int N = sc.nextInt();
        target = sc.nextInt();
        
            int[][] arr = new int[M][N];
            int num = 1;
            int x=0;
            int y=0;
            boolean flag= true;
            int cnt =1;
            for(int i=0; i<N; i++) {
                arr[x][i]=num++;
                y=i;
            }
           
            while(num<=N*M){
                if(flag) {
                    for(int i=0; i<M-cnt; i++) {
                    	
                        arr[++x][y]=num++;
                        
                    }
                    for(int i=0; i<N-cnt; i++) {
                    	
                        arr[x][--y]=num++;
                       
                    }
                    flag=false;
                }else {
                    for(int i=0; i<M-cnt; i++) {
                    	
                        arr[--x][y]=num++;
                        
                    }
                    for(int i=0; i<N-cnt; i++) {
                    	
                        arr[x][++y]=num++;
                        
                    }
                    flag=true;
                }
                cnt++;

            }
            for(int i=0; i<M; i++) {
               for(int j=0; j<N; j++) {
            	   if(arr[i][j]==target) {
            		   System.out.println((i+1)+" "+(j+1));
            		   return;
            	   }
               }
            }
            System.out.println(0);
           
    
	}

}