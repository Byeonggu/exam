import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hobbit= new int[9];
        int[] result= new int[7];
        boolean[] visit = new boolean[9];
        int sum=0;
        for(int i=0; i<9; i++) {
        	hobbit[i]=sc.nextInt();
        	sum+=hobbit[i];
        }
        outer: for(int i=0; i<9; i++) {
        	int num =sum - hobbit[i];
        	visit[i]=true;
        	for(int j=0; j<9; j++) {
            	if(visit[j]!=true&&num-hobbit[j]==100) {
            		hobbit[i]=0;
            		hobbit[j]=0;
            		//System.out.println(i+"/"+j);
            		break outer;
            	}
            }
        	visit[i]=false;
        }
        
        //System.out.println(Arrays.toString(hobbit));
        int cnt =0;
        for(int i=0; i<9; i++) {
        	if(hobbit[i] !=0) {
        		result[cnt]=hobbit[i];
        		cnt++;
        	}
        }
        Arrays.sort(result);
        for(int i: result) {
        	System.out.println(i);
        }
    }
}