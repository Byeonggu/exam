import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] iarr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            iarr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(iarr);
        String a1 = Integer.toString(iarr[0]);
        String a2 = Integer.toString(iarr[iarr.length-1]);
        String answer = a1+" "+a2;
        return answer;
    }
}