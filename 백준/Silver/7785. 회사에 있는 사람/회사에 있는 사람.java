import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> company = new HashMap<>();

        int tmp = Integer.parseInt(br.readLine());

        for(int i=0; i<tmp; i++){
            String[] str = br.readLine().split(" ");
            if(company.containsKey(str[0])){
                if(str[1].equals("leave")){
                    company.remove(str[0]);
                }
            }else{
                if(str[1].equals("enter")){
                    company.put(str[0], str[1]);
                }
            }
        }

        List<String> list = new ArrayList<>(company.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for(String a : list) System.out.println(a);
    }
}