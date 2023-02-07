import java.util.Scanner;

public class Solution {
	static int[][] map;
	static int N;
	static int M;
	static int Max =0;
	//각 부분마다 해당하는 파리 킬수 구하기 및 최대값 갱신하는 메서드
	public static void fnc(int X, int Y) {
		int sum=0;
		for(int i=X; i<X+M; i++) {
			for(int j=Y; j<Y+M; j++) {
				sum+=map[i][j];
			}
		}
		Max=Math.max(sum, Max);
	}

    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int T= sc.nextInt();
    for(int testCase=1; testCase<=T; testCase++) {
    	N= sc.nextInt();
    	M= sc.nextInt();
    	map= new int[N][N];
    	Max=0;
    	//배열에 값 넣기
    	for(int i=0; i<N; i++) {
    		for(int j=0; j<N; j++) {
    			map[i][j]=sc.nextInt();
    		}
    	}
    	
    	
    	//파리채 크기 고려해서 for문의 조건값 수정
    	for(int i=0; i<=N-M; i++) {
    		for(int j=0; j<=N-M; j++) {
    			//각 부분의 좌표로 메서드 실행
    			fnc(i,j);
    		}
    	}
    	sb.append("#"+testCase+" "+Max+"\n");
    	
    	
    }
    System.out.println(sb);

    }
}