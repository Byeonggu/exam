import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[T];
        for(int i =0; i<T; i++) {
        	arr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        int left = 1;
        int right = arr[arr.length-1]-arr[0]+1;
        while(left<right) {
//        	System.out.println(left+" "+ right);
        	
        	int mid = (right+left)/2;
        	
        	int result = fnc(mid);
        	if(result<M){
        		right=mid;
        	}else {
        		left=mid+1;
        	}
      	
        }
       System.out.println(left-1);
        
        br.close();
    }

	private static int fnc(int num) {
		// TODO Auto-generated method stub
		int cnt = 1;
		int idx= arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-idx >=num) {
				cnt++;
				idx=arr[i];
			}
		}
		return cnt;
	}
 
}
