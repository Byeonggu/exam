import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int maxX=Integer.MIN_VALUE;
		int minX=Integer.MAX_VALUE;
		int maxY=Integer.MIN_VALUE;
		int minY=Integer.MAX_VALUE;
		int[] leng= new int[6];
		for(int i=0; i<6; i++) {
			String[] input = br.readLine().split(" ");
			int[] arr = {Integer.parseInt(input[0]), Integer.parseInt(input[1])};
			//System.out.println(Arrays.toString(arr));
			leng[i]=arr[1];
			if(arr[0]<3) {
				maxY=Math.max(maxY, arr[1]);
			}else {
				maxX=Math.max(maxX, arr[1]);
			}
		}
		
		for(int i=0; i<6; i++) {
			if(leng[i]==maxY) {
				if(i>=1&&i<5){
					minX=Math.abs(leng[i-1]-leng[i+1]);
				}else if(i==0){
					minX=Math.abs(leng[leng.length-1]-leng[i+1]);
				}else if(i==5) {
					minX=Math.abs(leng[0]-leng[i-1]);
				}
				//System.out.println(minX);
			}
			if(leng[i]==maxX) {
				if(i>=1&&i<5){
					minY=Math.abs(leng[i-1]-leng[i+1]);
				}else if(i==0){
					minY=Math.abs(leng[leng.length-1]-leng[i+1]);
				}else if(i==5) {
					minY=Math.abs(leng[0]-leng[i-1]);
				}
				//System.out.println(minY);
			}
		}
//		System.out.println(maxX*maxY);
//		System.out.println(minX*minY);
		int size = (maxX*maxY)-(minX*minY);
		System.out.println(size*cnt);
	}
	
	

}