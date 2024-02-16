import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        } 
        for(int i = 0; i < discount.length - days + 1; i++){
            
            Map<String, Integer> nMap = new HashMap<>();
            for(int j = 0; j < days; j++){
                nMap.put(discount[i + j], nMap.getOrDefault(discount[i + j], 0) + 1);
            }
            Boolean flag = true;
            for(String key : map.keySet()){
                if(map.get(key) != nMap.get(key)){
                    flag = false;
                    break;
                }
            }
            answer += flag ? 1 : 0;
        }
        return answer;
    }
}