import java.util.*;

class Solution {
    public long solution(int[] weights) {
        Map<Integer, Long> counter = new HashMap();
        for (int w : weights){
            counter.put(w, counter.getOrDefault(w, 0L)+1);
        }
        
        long answer = 0;
        for (int w : counter.keySet()){
            long n = counter.getOrDefault(w, 0L);
            if (n>1) answer += (n-1)*n/2;
            
            if (w%2==0) answer += n*counter.getOrDefault(w*3/2, 0L);
            if (w%3==0) answer += n*counter.getOrDefault(w*4/3, 0L);
            answer += n*counter.getOrDefault(w*2, 0L);
        }
        return answer;
    }
}