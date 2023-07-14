import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int cnt = 0;
        boolean flag = true;
        Set<String> list = new HashSet<>();
        for(int i=0; i<tc; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                list.clear();
                continue;
            }
            if(!list.contains(str)){
                list.add(str);
                cnt++;
            }
        }
        System.out.println(cnt);
    }


}
