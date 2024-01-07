import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int card1Size = cards1.length;
        int card2Size = cards2.length;
        int goalSize = goal.length;
        int card1idx = 0;
        int card2idx = 0;
        int goalidx=0;
        while(true){
            if(goalidx==goalSize){
                answer="Yes";
                break;
            }
            
            if(card1idx<card1Size && goal[goalidx].equals(cards1[card1idx])){
                card1idx++;
                goalidx++;
            }else if(card2idx<card2Size && goal[goalidx].equals(cards2[card2idx])){
                card2idx++;
                goalidx++;
            }else{
                answer="No";
                break;
            }
        }
        
        
        
        return answer;
    }
}