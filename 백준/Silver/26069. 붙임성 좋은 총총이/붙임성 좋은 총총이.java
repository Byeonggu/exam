import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ChongChong");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i= 0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if(hashSet.contains(name1) || hashSet.contains(name2)){
                hashSet.add(name1);
                hashSet.add(name2);
            }
        }

        System.out.println(hashSet.size());




    }
}
