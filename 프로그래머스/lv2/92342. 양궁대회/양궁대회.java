import java.util.*;
class Solution {
    static int result=-1;
    static int[] rs = new int[11];
    public int[] solution(int n, int[] info) {
        
        int[] answer = new int[11];
        int tmp =n;
        dfs(info, answer, 0, n);
        
        System.out.println(result+"/"+Arrays.toString(rs));
        if(result==-1 || result==0){
            return new int[]{-1};
        }
        return rs;
    }
    
    public void dfs(int[] peach, int[] lion, int depth, int tmp){
        if(tmp==0){
            if(check(peach, lion)>result){
                 result=check(peach, lion);
                copy(lion, rs);
            }else if(check(peach, lion)==result){
                if(!samecheck(rs, lion)){
                    result=check(peach, lion);
                    copy(lion, rs);
                }
            }
           
            return;
        }
        if(depth==11){
            if(tmp>0)lion[10]=tmp;
            if(check(peach, lion)>result){
                 if(tmp>0)lion[10]=tmp;
                 result=check(peach, lion);
                copy(lion, rs);
            }else if(check(peach, lion)==result){
                
                if(!samecheck(rs, lion)){
                    result=check(peach, lion);
                    copy(lion, rs);
                }
            }
            return;
        }
        
        for(int i=0; i<=tmp; i++){
            lion[depth]=i;
            dfs(peach, lion, depth+1, tmp-i);
            lion[depth]=0;
        }
        
    }
    
    public void copy(int[] a, int[] b){
        for(int i=0; i<11; i++){
            b[i] = a[i];
        }
    }
    
    
    public int check(int[] peach, int[] lion){
        int ans=0;
        int peachCnt=0;
        for(int i=0; i<11; i++){
            if(peach[i]<lion[i]){
                ans+=10-i;
            }if(peach[i]!=0 && peach[i]>=lion[i]){
                peachCnt+=10-i;
            }
        }
        return ans-peachCnt;
    }
    public boolean samecheck(int[] tmp, int[] lion){
        boolean flag = true;
        for(int i=10; i>=0; i--){
            if(tmp[i]<lion[i]){
                flag=false;
                break;
            }else if(tmp[i]>lion[i]){
                break;
            }
        }
        return flag;
    }
}