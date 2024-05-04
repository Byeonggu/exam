import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        int length = arr.length;
        if(length%2 == 0){
            answer+=Character.toString(arr[length/2-1])+Character.toString(arr[length/2]);
        }else{
            answer+=arr[length/2];
        }
        
        
        return answer;
    }
}