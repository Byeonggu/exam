import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        while(true){
            String input = br.readLine();
            String[] arr = input.split("");
            if(Integer.parseInt(input) == 0) break;

            boolean flag = true;
            for(int i=0; i<arr.length/2; i++){
                if(!arr[i].equals(arr[arr.length-1-i]))flag=false;
            }

            if(flag)sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.println(sb);
    }
}
