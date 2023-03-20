import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    static int[] tree;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        tree = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            tree[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tree);
        long left  = 1;
        long right = tree[N-1];

        while(left<=right) {
        	long mid= (right+left)/2;
//           
//            if(cut(mid)==M) {
//                System.out.println(left);
//                return;
//            }else
            	if(cut(mid)<M) {
                
                right=mid-1;
            }else {
            	left=mid+1;
            }
        }
        System.out.println(left-1);


    }
    private static long cut(long mid) {
        // TODO Auto-generated method stub
    	long sum =0;
        for(int i=0; i<tree.length; i++) {
            if(tree[i]-mid>0) {
                sum+=tree[i]-mid;
            }
        }
        return sum;
    }

}