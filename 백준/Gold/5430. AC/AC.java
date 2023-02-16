import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean reverse;
		Deque<Integer> queue;
		//테스트 케이스 
		int T = sc. nextInt();
		sc.nextLine();
		
		//테스트케이스 루프
		outer:for(int testCase=0; testCase<T; testCase++){
			//덱과 reverse초기화
			queue = new ArrayDeque<>();
			reverse= false;
			
			//수행어 배열 입력 받기
			String[] str = sc.nextLine().split("");
			
			//덱의 갯수 입력받기
			int N = sc.nextInt();
			sc.nextLine();
			
			//덱 입력받기
			String input =sc.nextLine();
			input = input.replaceAll("\\[", "");
			input = input.replaceAll("\\]", "");
			String[] tArr = input.split(",");
			
			//덱에 집어넣기
			for(int i=0; i<N; i++) {
				queue.add(Integer.parseInt(tArr[i]));
			}
			
			//수행어 배열 돌리기
			for(String s : str) {
				//수행어 s에 대한 switch문
				switch (s) {
					//"R" 리버스일 경우
					case "R":
						//reverse가 참일 경우=역순
						//reverse가 false일 경우 = 순서대로
						if(reverse) {
							reverse=false;
						}else {
							reverse=true;
						}
						break;
						
					//"D" 삭제일 경우	
					case "D":
						
						if(reverse) {
							if(queue.pollLast()==null) {
								sb.append("error\n");
								continue outer;
							}
						}else {
							if(queue.pollFirst()==null) {
								sb.append("error\n");
								continue outer;
							}
						}
						break;
				}
			}
			//역순 일 경우
			if(reverse) {
				//덱이 비어있을 경우 빈배열 출력
				if(queue.isEmpty()) {
					sb.append("[]\n");
				}else {
					//역순일경우 뒤에서 부터 순서대로 출력
					sb.append("[");
					//System.out.println(sb.length());
					Iterator<Integer> reverseIterator = queue.descendingIterator();
					
					while (reverseIterator.hasNext()) {
						  int num = reverseIterator.next();
						  sb.append(num+",");
						}
					 sb.deleteCharAt(sb.length() - 1);
					sb.append("]\n");
				}
				//순서대로일 경우
			}else {
				//덱이 비어있을 경우 빈배열 출력
				if(queue.isEmpty()) {
					sb.append("[]\n");
				}else {
					//앞에서 부터 순서대로 출력
					sb.append("[");
					
					Iterator<Integer> Iterator = queue.iterator();
					while (Iterator.hasNext()) {
						  int num = Iterator.next();
						  sb.append(num+",");
						}
					 sb.deleteCharAt(sb.length() - 1);
					sb.append("]\n");
				}
			}
		}
		System.out.println(sb);
	}


}