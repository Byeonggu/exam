import java.util.Scanner;

public class Main {
	static String[][] map;
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        map = new String[T][T];
        
        fnc(T, false, 0,0);
        
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<T; i++) {
    		for(int j=0; j<T; j++) {
    			sb.append(map[i][j]);
    		}
    		sb.append("\n");
    	}
        System.out.println(sb);
        
    
    
}    

	public static void fnc(int T, boolean blank, int idx, int idy) {
	    if(blank) {
	    	for(int i=idx; i<idx+T; i++) {
	    		for(int j=idy; j<idy+T; j++) {
	    			map[i][j]=" ";
	    		}
	    	}
	    	return;
	    }
	    
	    if(T==1) {
	    	map[idx][idy]="*";
	    	return;
	    }
	    
	    int cnt=0;
	    int num=T/3;
	    for(int i=idx; i<idx+T; i+=num) {
    		for(int j=idy; j<idy+T; j+=num) {
    			if(cnt==4) {
    				fnc(num, true, i,j);
    			}else {
    				fnc(num, false, i,j);
    			}
    			cnt++;
    		}
    	}
	    
	}
}