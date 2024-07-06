import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNum = 0;
        int x = 0,y=0;
        for(int i=0; i<9; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<9; j++){
                int tmp = Integer.parseInt(input[j]);
                if(tmp>=maxNum){
                    x=i+1; y=j+1;
                    maxNum= tmp;
                }

            }
        }
        System.out.println(maxNum);
        System.out.println(x+" "+y);
    }
}