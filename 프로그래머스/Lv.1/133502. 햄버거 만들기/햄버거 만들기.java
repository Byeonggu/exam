import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i: ingredient){
            stack.push(i);
            if(stack.size() >= 4) {
                int first = stack.get(stack.size() - 4);
                int second = stack.get(stack.size() - 3);
                int third = stack.get(stack.size() - 2);
                int fourth = stack.peek();
                if(first == 1 && second == 2 && third == 3 && fourth == 1) {
                    for(int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                    answer++;
                }
            }
        }
       
        return answer;
    }
}
