import java.util.*;
class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        int monthday = 28;
        int todayY = Integer.parseInt(today.substring(0,4));
        int todayM = Integer.parseInt(today.substring(5,7));
        int todayD = Integer.parseInt(today.substring(8,10));
        int totalDay = ( todayY * monthday * 12 ) + ( todayM * 28 ) + todayD;

        List<Integer> answer = new ArrayList<>();

        HashMap<Character , Integer> map = new HashMap<>();
        for(String term : terms ){
            char term0 = term.charAt(0);
            int termM = Integer.parseInt(term.substring(2));
            map.put( term0 , termM );
        }
        
        for( int i = 0 ; i < privacies.length ; i++ ){

            char privacy0 = privacies[i].charAt(11);

            int nY = Integer.parseInt(privacies[i].substring(0,4));
            int nM = Integer.parseInt(privacies[i].substring(5,7));
            int nD = Integer.parseInt(privacies[i].substring(8,10));
            int totalNDay = ( nY * 12 * monthday ) + ( nM * monthday ) + nD;

            int termM = map.get(privacy0);
            int termDay = termM * monthday;

            if( totalNDay + termDay <= totalDay ) {
                answer.add(i+1);
            }
            
        }
        
        
        return answer;
    }
}
