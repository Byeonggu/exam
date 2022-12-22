import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    String result = "";
    int[][] arr = new int[15][15];

    for (int i=0;i<15;i++) {
      arr[i][0] = 1;
      arr[0][i] = i+1;
    }

    for (int j=1;j<15;j++) {
      for (int k=1;k<15;k++) {
        arr[j][k] = arr[j-1][k] + arr[j][k-1];
      }
    }
    
    int t = Integer.parseInt(br.readLine());

    for (int z=0;z<t;z++) {
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      result +=String.valueOf(arr[a][b-1])+ "\n";
      
      
    }
    System.out.println(result.substring(0,result.length()-1));
   br.close();
  }
}