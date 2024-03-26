import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        StringTokenizer st;
        for(int i=0; i<operations.length; i++){
            st = new StringTokenizer(operations[i]);
            char tmp = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());
            
            if(tmp=='I'){
                max.add(num);
                min.add(num);
            }else{
                if(max.isEmpty()) continue;
                else if(num == 1){
                    int del = max.poll();
                    min.remove(del);
                }else if(num == -1){
                    int del = min.poll();
                    max.remove(del);
                }
            }
        }
        if(max.isEmpty()){
            return new int[]{0,0};
        }
        return new int[] {max.peek(), min.peek()};
        
        
    }
}