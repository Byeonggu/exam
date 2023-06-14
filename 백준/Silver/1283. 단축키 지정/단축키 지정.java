import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String[] tmp = br.readLine().split(" ");
            //앞글자가 단축키일 경우 t/f플래그
            boolean flag = false;
            //앞글자가 단축키일 경우
            for(int j =0; j<tmp.length; j++) {
                String fAlp = tmp[j].substring(0,1);
                if(!check(fAlp)){
                    list.add(fAlp.toUpperCase());
                    fAlp = "["+fAlp+"]";
                    String lAlp = tmp[j].substring(1,tmp[j].length());
                    tmp[j]= fAlp+lAlp;
                    flag = true;
                    break;
                }
            }
            //앞글자들이 단축키가 못 될 경우
            if(!flag){
                outer : for(int j =0; j<tmp.length; j++) {
                    for(int d = 1; d<tmp[j].length(); d++){
                        String text =Character.toString(tmp[j].charAt(d));
                        if(!check(text)){
                            list.add(text.toUpperCase());
                            String left= tmp[j].substring(0,d);
                            text = "["+text+"]";
                            String right= tmp[j].substring(d+1,tmp[j].length());
                            tmp[j]= left + text + right;
                            break outer;
                        }
                    }
                }
            }
            for(int j=0; j< tmp.length; j++){
                sb.append(tmp[j]+" ");
            }



            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static boolean check(String str){
        boolean flag = false;
        str = str.toUpperCase();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(str)){
                flag=true;
            }
        }
        return flag;
    };
}