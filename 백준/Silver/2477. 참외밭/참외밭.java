import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        int[] leng = new int[6];
        for(int i=0; i<6; i++){
            String[] input = br.readLine().split(" ");
            leng[i] = Integer.parseInt(input[1]);
            int dir = Integer.parseInt(input[0]);
            if(dir<3){
                maxY=Math.max(maxY, leng[i]);
            }else{
                maxX=Math.max(maxX, leng[i]);
            }
        }

        for(int i=0; i<6; i++) {
            if(leng[i]==maxY) {
                if(i>=1&&i<5){
                    minX=Math.abs(leng[i-1]-leng[i+1]);
                }else if(i==0){
                    minX=Math.abs(leng[5]-leng[1]);
                }else if(i==5) {
                    minX=Math.abs(leng[0]-leng[4]);
                }
                //System.out.println(minX);
            }
            if(leng[i]==maxX) {
                if(i>=1&&i<5){
                    minY=Math.abs(leng[i-1]-leng[i+1]);
                }else if(i==0){
                    minY=Math.abs(leng[5]-leng[1]);
                }else if(i==5) {
                    minY=Math.abs(leng[0]-leng[4]);
                }
            }
        }
        int size = (maxX*maxY)-(minX*minY);
        System.out.println(size*cnt);


    }
}
