import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int ans = 1;
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
 
            if (c != input.charAt(input.length() - i - 1)) {
                ans = 0;
                break;
            }
        }
 
        System.out.println(ans);
        
        br.close();
    }
 
}