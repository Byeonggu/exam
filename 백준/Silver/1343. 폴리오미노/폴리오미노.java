import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split( "");
        Queue<Integer> queue =new LinkedList();
        int tmp =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("X")){
                tmp++;
            }
            else {
                if(tmp!=0)queue.add(tmp);
                queue.add(0);
                tmp=0;
            }

        }
        if(tmp!=0)queue.add(tmp);
//        System.out.println("큐의 사이즈 :" +queue.size());
//        System.out.println(queue.toArray()[queue.size()-1]);
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int size = queue.size();
        for(int i=0; i<size; i++){
            int num = queue.poll();
//            System.out.println("i:"+i+"/ num :"+num);
            if(num==0) {
                sb.append(".");
            }else if(num%2 ==1){
                flag=false;
                System.out.println(-1);
                break;
            }else{
                int A=num/4;
                int B=num%4;

                for(int j=0; j<A; j++){
                    sb.append("AAAA");
                }
                if(B==2){
                    sb.append("BB");
                }
            }
        }

        if(flag) System.out.println(sb);


    }

}
