import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        MinHeap hip = new MinHeap(N+1);

        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) System.out.println(hip.delete());
            else  hip.insert(x);
        }
    }
    
    //최대 힙 클래스 생성
    private static class MinHeap {
    	//힙 배열
        int heap[];
        //힙 사이즈
        int size;
        
        //힙생성자 =>생성할때 사이즈 크기 변수로 받기
        public MinHeap(int size) {
        	//받은 사이즈로 힙배열 초기화
            heap = new int[size];
        }

        //힙 배열에 값을 넣는 메서드
        public void insert(int x) {
        	//힙배열에 값을 넣어줌
            heap[++size] = x;    //heap[1] = x 넣어줌

            //힙배열에 들어가 크기 만큼 for문
            for(int i=size; i>1; i/=2) {
                //새로들어온 자식이랑 부모랑 비교함
                if(heap[i/2] < heap[i]) { 
                	//부모 노드보다 크다면 교환
                    swap(i/2, i);
                }else {
                    break;
                }
            }
        }//insert 할 때마다 min값이 heap[1]에 들어간다. 
      //입력값이 0일때  최소 값을 삭제하는 메서드
        public int delete() {    
             //사이즈가 0이라면 0출력
            if(size == 0) {
                return 0;
            }
            
            //최대값을 따로 저장
            int root = heap[1]; 
            //루트에 마지막 값 넣어줌
            heap[1] = heap[size]; 
            // 값 하나 뺐으니 사이즈도 하나 빼줌     
            size--;                 

            //힙을 다시 정렬
            for(int i=1; i*2<=size;) { 
            	//부모 노드가  자식 보다 작으면 정지 
                if(heap[i] >= heap[i*2] && heap[i] >= heap[i*2+1]) {
                    break;
                //왼쪽이 오른쪽보다 작으면
                }else if(heap[i*2] > heap[i*2+1]) {   
                //왼쪽과 부모 노드를 교환
                    swap(i, i*2);                
                    i = i*2;                        
                }else {
                //오른쪽과 부모 노드를 교환
                    swap(i, i*2+1);
                    i = i*2+1;
                }
            }
            return root;
        }
        //서로 교환하는 메서드
        public void swap(int a, int b) {
            int temp = heap[a];
            heap[a] = heap[b];
            heap[b] = temp;
        }


    }
}