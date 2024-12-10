class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long pValue = Long.parseLong(p); 
        
        int start = 0;
        int end = length - 1;
        
        while (end < t.length()) { 
            
            String tmp = t.substring(start, end + 1); 
            
           
            if (Long.parseLong(tmp) <= pValue) {
                answer++;
            }
            
            start++;
            end++;
        }
        return answer;
    }
}
