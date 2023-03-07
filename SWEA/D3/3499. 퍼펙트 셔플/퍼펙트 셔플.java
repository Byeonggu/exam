import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        Queue<String> qu1 = new LinkedList<String>();
         
        for(int testCase =1; testCase<=T; testCase++) {
            int N = sc.nextInt();
            sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            for(int i=0; i<arr.length/2; i++) {
                if(N%2==0) {
                    qu1.add(arr[i]);
                    qu1.add(arr[i+arr.length/2]);
                }else {
                    qu1.add(arr[i]);
                    qu1.add(arr[i+arr.length/2+1]);
                }
            }
            if(N%2!=0) {
                qu1.add(arr[arr.length/2]);
            }
            sb.append("#"+testCase+" ");
            while(!qu1.isEmpty()) {
                sb.append(qu1.poll()+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
         
    }
}