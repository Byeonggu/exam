import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[][] mapA = new int[N][M];


        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j<M; j++){
                mapA[i][j] = Integer.parseInt(input[j]);
            }
        }
        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j<M; j++){
                mapA[i][j] += Integer.parseInt(input[j]);
                sb.append(mapA[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}