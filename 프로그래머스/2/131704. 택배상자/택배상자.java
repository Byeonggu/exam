import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int tmp = 0;
        int[] arr = new int[order.length];
        for(int i = 0; i < order.length; i++){
            arr[order[i] - 1] = i;
        }
        
        Stack<Integer> stack = new Stack<>();

     
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == tmp){
                tmp++;
            }else{
                stack.push(arr[i]);
            }
            while(!stack.isEmpty() && stack.peek() == tmp){
                stack.pop();
                tmp++;
            }
        }
        return tmp;
    }
}