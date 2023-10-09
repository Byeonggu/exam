import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int tmp = nums.length / 2;
        HashSet<Integer> Set = new HashSet<>();
        for (int num : nums) {
            Set.add(num);
        }
        if (Set.size() > tmp) return tmp;
        else return Set.size();
        
    }
    
}