import java.util.*;

class Solution {
    
    public Map<String,Integer> map;
    public int max = 0;
    
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> ans = new ArrayList<>();
        for(int c : course){
            map = new HashMap<>();
            max = 0;
            
            for(String order: orders){
                char[] strs = order.toCharArray();
                Arrays.sort(strs);
                order = new String(strs);
                dfs(0,-1,order,"",c);
            }
            
            for(String key : map.keySet()){
                int value = map.get(key);
                if(value > 1 && max == value){
                    ans.add(key);
                }
            }
        }
        
        Collections.sort(ans);
        String[] answer = ans.toArray(new String[ans.size()]);
        
        return answer;
    }
    
    public void dfs(int stage, int pidx, String order,String cur, int end){
        if(stage == end){
            map.put(cur,map.getOrDefault(cur,0)+1);
            max = Math.max(max,map.get(cur));
        }
        
        for(int i = pidx+1; i < order.length(); i++){
            dfs(stage+1,i,order,cur + order.charAt(i),end);
        }
    }
}