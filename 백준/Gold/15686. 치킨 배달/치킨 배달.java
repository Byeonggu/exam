import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
//	static int map[][];
	static ArrayList<Node> chList;
	static ArrayList<Node> hoList;
	static int[] distance;
	static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		chList = new ArrayList<>();
		hoList = new ArrayList<>();
//		map = new int[N][N];
		result = Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
//				map[i][j]= Integer.parseInt(st.nextToken());
				int num = Integer.parseInt(st.nextToken());
				if(num==2)chList.add(new Node(i, j));
				if(num==1)hoList.add(new Node(i, j));
			}
		}
		
		int chCnt = chList.size();
		int hoCnt = hoList.size();
		
		int[] distance = new int[hoCnt];
		Arrays.fill(distance, 101);
		
		dfs(0, distance, 0);
		
		System.out.println(result);
		
		
	}
	
	static void dfs(int idx,int[] arr,int depth) {
		
		if(depth ==M) {
//			System.out.println(Arrays.toString(arr));
			result = Math.min(result, totalD(arr));
			return;
		}
		
		for(int i=idx; i<chList.size(); i++) {
			int[] tmp = copy(arr);
			Node chicken = chList.get(i);
			for(int j=0; j<tmp.length; j++) {
				tmp[j]= Math.min(tmp[j], getDistance(chicken, hoList.get(j)));
			}
			dfs(i+1, tmp, depth+1);
		}
		
		
		
		
		
	}
	
	
	static int[] copy(int[] arr) {
		int[] tmp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			tmp[i]= arr[i];
		}
		return tmp;
	}
	
	
	
	static int totalD(int arr[]) {
		int ans =0;
		for(int i: arr)ans+=i;
		return ans;
	}
	
	
	
	static class Node{
		int x; 
		int y;
		public Node(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x= x;
			this.y= y;
		}
	}
	
	

	
	
	
	
	
	//거리를 구하는 메서드
	static int getDistance(Node ch, Node ho) {
		int ans=Math.abs(ch.x-ho.x)+Math.abs(ch.y-ho.y);
		return ans;
	}
}