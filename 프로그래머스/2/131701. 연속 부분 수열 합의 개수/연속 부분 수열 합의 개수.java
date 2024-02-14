import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int tmp = 1;
        Set<Integer> set = new HashSet<>();
        while (tmp <= elements.length) {
            int sum = 0;
            for (int i = 0; i < tmp; i++) {
                sum += elements[i % elements.length];
                set.add(sum);
            }
            for (int i = 0; i < elements.length; i++) {
                sum -= elements[i % elements.length];
                sum += elements[(i + tmp) % elements.length];
                set.add(sum);
            }
            tmp++;
        }
        answer = set.size();
        return answer;
    }
}