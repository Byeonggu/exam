import java.util.*; 
class Solution {    
    public int solution(int[][] targets) {        
        int answer = 0;                
        Arrays.sort(targets, ((x, y) -> x[0] - y[0]));                
        int start = targets[0][0];        
        int end = targets[0][1];                    
        for (int[] target : targets) {            
            if (answer == 0) {                
                answer += 1;                
                continue;            
            }                        
            int curStart = target[0];            
            int curEnd = target[1];                        
            if (start <= curStart && curStart < end) {            	              
                start = Math.max(start, curStart);                
                end = Math.min(end, curEnd);            
            }else{                
                start = curStart;                
                end = curEnd;                
                answer += 1;            
            }                
        }            
        return answer;    
    }
}
