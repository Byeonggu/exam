import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        String[] rs = dartResult.split("");
        int idx=0;
        for(int i=0; i<rs.length; i++){
            try {
              int tmp = Integer.parseInt(rs[i]);
              if(tmp == 1){
                  if(rs[i+1].equals("0")){
                      tmp =10;
                      i+=1;
                  }
              }
              score[idx++] = tmp;
            } catch (NumberFormatException ex) {
                switch(rs[i]) {
                        case "S":
                             break;
                        case "D":
                             score[idx-1] =(int)Math.pow(score[idx-1],2);
                             break;
                        case "T":
                             score[idx-1] =(int)Math.pow(score[idx-1],3);
                             break;
                        case "*":
                             if(idx==1)score[idx-1]=score[idx-1]*2;
                                else{
                                    score[idx-1]=score[idx-1]*2;
                                    score[idx-2]=score[idx-2]*2;
                                }
                             break;
                        case "#": 
                             score[idx-1]*=-1;
                             break;

                }
            }

        }
        for(int i=0; i<3; i++){
            answer+=score[i];
        }
        return answer;
    }
}