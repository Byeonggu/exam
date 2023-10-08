import java.util.*;

class Solution {
    static int min = Integer.MAX_VALUE;
    public int solution(int[] picks, String[] minerals) {
        for(int i=0; i<3; i++){
            if(picks[i] !=0){
                int[] picksCopy = picks.clone();
                picksCopy[i] = picksCopy[i]-1;
                dfs(picksCopy, minerals, i, 0, 0);
            }
        }
        
        return min;
    }
    
    public void dfs(int[] picks, String[] minerals, int pick, int depth, int result){
        int tmp =0;
        for(int i=0; tmp<5; tmp++){
            if(depth+tmp>=minerals.length){
                break;
            }
            if(pick == 0){
                result+=1;
            }else if(pick ==1){
                if(minerals[depth+tmp].equals("diamond")){
                    result +=5;
                }else{
                    result+=1;
                }
            }else{
                if(minerals[depth+tmp].equals("diamond")){
                    result +=25;
                }else if(minerals[depth+tmp].equals("iron")){
                    result+=5;
                }else{
                    result+=1;
                }
            }
            
        }
        depth+=tmp;
        if(depth>=minerals.length){
            if(min>result){
                min = result;
            }
            return;
        }
        if(picks[0]==0 && picks[1]==0&&picks[2]==0){
            if(min>result){
                min = result;
            }
            return;
        }
        if(result>=min){
            return;
        }
        for(int i=0; i<3; i++){
            if(picks[i] !=0){
                int[] picksCopy = picks.clone();
                picksCopy[i] = picksCopy[i]-1;
                dfs(picksCopy, minerals, i, depth, result);
            }
        }
        
    }
}